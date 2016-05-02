package org.xtext.example.mydsl1.typing;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.mydsl1.aDSL.ADSLFactory;
import org.xtext.example.mydsl1.aDSL.ADSLPackage;
import org.xtext.example.mydsl1.aDSL.BoolConstant;
import org.xtext.example.mydsl1.aDSL.DeRef;
import org.xtext.example.mydsl1.aDSL.Expression;
import org.xtext.example.mydsl1.aDSL.Here;
import org.xtext.example.mydsl1.aDSL.IntConstant;
import org.xtext.example.mydsl1.aDSL.Member;
import org.xtext.example.mydsl1.aDSL.MemberSelection;
import org.xtext.example.mydsl1.aDSL.Method;
import org.xtext.example.mydsl1.aDSL.New;
import org.xtext.example.mydsl1.aDSL.Null;
import org.xtext.example.mydsl1.aDSL.Parameter;
import org.xtext.example.mydsl1.aDSL.Reference;
import org.xtext.example.mydsl1.aDSL.SharedArrayDef;
import org.xtext.example.mydsl1.aDSL.SharedDef;
import org.xtext.example.mydsl1.aDSL.SharedVarDef;
import org.xtext.example.mydsl1.aDSL.StringConstant;
import org.xtext.example.mydsl1.aDSL.This;
import org.xtext.example.mydsl1.aDSL.VarDef;
import org.xtext.example.mydsl1.aDSL.VariableDef;
import org.xtext.example.mydsl1.aDSL.VariableType;
import org.xtext.example.mydsl1.aDSL.XClass;
import org.xtext.example.mydsl1.lib.ADSLLib;
import org.xtext.example.mydsl1.util.ADSLUtil;

@SuppressWarnings("all")
public class ADSLTypeProvider {
  @Inject
  @Extension
  private ADSLLib _aDSLLib;
  
  @Inject
  private IGlobalScopeProvider globalScopeProvider;
  
  private final ADSLPackage ep = ADSLPackage.eINSTANCE;
  
  public final static XClass stringType = ObjectExtensions.<XClass>operator_doubleArrow(
    ADSLFactory.eINSTANCE.createXClass(), ((Procedure1<XClass>) (XClass it) -> {
    it.setName("String");
  }));
  
  public final static XClass intType = ObjectExtensions.<XClass>operator_doubleArrow(
    ADSLFactory.eINSTANCE.createXClass(), ((Procedure1<XClass>) (XClass it) -> {
    it.setName("Boolean");
  }));
  
  public final static XClass booleanType = ObjectExtensions.<XClass>operator_doubleArrow(
    ADSLFactory.eINSTANCE.createXClass(), ((Procedure1<XClass>) (XClass it) -> {
    it.setName("Integer");
  }));
  
  public final static XClass nullType = ObjectExtensions.<XClass>operator_doubleArrow(
    ADSLFactory.eINSTANCE.createXClass(), ((Procedure1<XClass>) (XClass it) -> {
    it.setName("String");
  }));
  
  public final static XClass placeType = ObjectExtensions.<XClass>operator_doubleArrow(
    ADSLFactory.eINSTANCE.createXClass(), ((Procedure1<XClass>) (XClass it) -> {
    it.setName("Place");
  }));
  
  public XClass typeFor(final Expression e) {
    XClass _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof This) {
        _matched=true;
        _switchResult = ADSLUtil.containingXClass(e);
      }
    }
    if (!_matched) {
      if (e instanceof Reference) {
        _matched=true;
        XClass _xifexpression = null;
        boolean _isIsarray = ((Reference)e).isIsarray();
        boolean _not = (!_isIsarray);
        if (_not) {
          VarDef _base = ((Reference)e).getBase();
          _xifexpression = this.switchVarType(_base);
        } else {
          VarDef _base_1 = ((Reference)e).getBase();
          _xifexpression = this.innerType(_base_1);
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (e instanceof New) {
        _matched=true;
        VariableType _type = ((New)e).getType();
        XClass _type_1 = null;
        if (_type!=null) {
          _type_1=_type.getType();
        }
        _switchResult = _type_1;
      }
    }
    if (!_matched) {
      if (e instanceof MemberSelection) {
        _matched=true;
        Member _member = ((MemberSelection)e).getMember();
        _switchResult = this.switchType(_member);
      }
    }
    if (!_matched) {
      if (e instanceof DeRef) {
        _matched=true;
        VarDef _ref = ((DeRef)e).getRef();
        _switchResult = this.innerType(_ref);
      }
    }
    if (!_matched) {
      if (e instanceof Null) {
        _matched=true;
        _switchResult = ADSLTypeProvider.nullType;
      }
    }
    if (!_matched) {
      if (e instanceof StringConstant) {
        _matched=true;
        _switchResult = ADSLTypeProvider.stringType;
      }
    }
    if (!_matched) {
      if (e instanceof IntConstant) {
        _matched=true;
        _switchResult = ADSLTypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        _switchResult = ADSLTypeProvider.booleanType;
      }
    }
    if (!_matched) {
      if (e instanceof Here) {
        _matched=true;
        _switchResult = this.getHere(e);
      }
    }
    return _switchResult;
  }
  
  public XClass getHere(final EObject e) {
    Resource _eResource = e.eResource();
    EReference _createEReference = EcoreFactory.eINSTANCE.createEReference();
    final Procedure1<EReference> _function = (EReference it) -> {
      it.setEType(ADSLPackage.Literals.XCLASS);
    };
    EReference _doubleArrow = ObjectExtensions.<EReference>operator_doubleArrow(_createEReference, _function);
    Predicate<IEObjectDescription> _alwaysTrue = Predicates.<IEObjectDescription>alwaysTrue();
    IScope _scope = this.globalScopeProvider.getScope(_eResource, _doubleArrow, _alwaysTrue);
    QualifiedName _create = QualifiedName.create("Place");
    IEObjectDescription _singleElement = _scope.getSingleElement(_create);
    EObject _eObjectOrProxy = _singleElement.getEObjectOrProxy();
    XClass result = ((XClass) _eObjectOrProxy);
    Resource _eResource_1 = e.eResource();
    ResourceSet _resourceSet = _eResource_1.getResourceSet();
    EObject _resolve = EcoreUtil.resolve(result, _resourceSet);
    return ((XClass) _resolve);
  }
  
  public XClass innerType(final VarDef v) {
    XClass _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (v instanceof VariableDef) {
        _matched=true;
        VariableType _type = ((VariableDef)v).getType();
        VariableType _innerType = null;
        if (_type!=null) {
          _innerType=_type.getInnerType();
        }
        _switchResult = _innerType.getType();
      }
    }
    if (!_matched) {
      if (v instanceof SharedArrayDef) {
        _matched=true;
        VariableType _type = ((SharedArrayDef)v).getType();
        VariableType _innerType = null;
        if (_type!=null) {
          _innerType=_type.getInnerType();
        }
        _switchResult = _innerType.getType();
      }
    }
    if (!_matched) {
      _switchResult = ADSLTypeProvider.nullType;
    }
    return _switchResult;
  }
  
  public XClass switchVarType(final VarDef v) {
    XClass _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (v instanceof VariableDef) {
        _matched=true;
        VariableType _type = ((VariableDef)v).getType();
        XClass _type_1 = null;
        if (_type!=null) {
          _type_1=_type.getType();
        }
        _switchResult = _type_1;
      }
    }
    if (!_matched) {
      if (v instanceof XClass) {
        _matched=true;
        _switchResult = ((XClass)v);
      }
    }
    if (!_matched) {
      if (v instanceof Parameter) {
        _matched=true;
        VariableType _type = ((Parameter)v).getType();
        XClass _type_1 = null;
        if (_type!=null) {
          _type_1=_type.getType();
        }
        _switchResult = _type_1;
      }
    }
    if (!_matched) {
      if (v instanceof SharedVarDef) {
        _matched=true;
        VariableType _type = ((SharedVarDef)v).getType();
        XClass _type_1 = null;
        if (_type!=null) {
          _type_1=_type.getType();
        }
        _switchResult = _type_1;
      }
    }
    if (!_matched) {
      if (v instanceof SharedArrayDef) {
        _matched=true;
        VariableType _type = ((SharedArrayDef)v).getType();
        XClass _type_1 = null;
        if (_type!=null) {
          _type_1=_type.getType();
        }
        _switchResult = _type_1;
      }
    }
    if (!_matched) {
      _switchResult = ADSLTypeProvider.nullType;
    }
    return _switchResult;
  }
  
  public XClass switchType(final Member m) {
    XClass _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (m instanceof VariableDef) {
        _matched=true;
        VariableType _type = ((VariableDef)m).getType();
        XClass _type_1 = null;
        if (_type!=null) {
          _type_1=_type.getType();
        }
        _switchResult = _type_1;
      }
    }
    if (!_matched) {
      if (m instanceof SharedDef) {
        _matched=true;
        VariableType _type = ((SharedDef)m).getType();
        XClass _type_1 = null;
        if (_type!=null) {
          _type_1=_type.getType();
        }
        _switchResult = _type_1;
      }
    }
    if (!_matched) {
      if (m instanceof Method) {
        _matched=true;
        VariableType _type = ((Method)m).getType();
        XClass _type_1 = null;
        if (_type!=null) {
          _type_1=_type.getType();
        }
        _switchResult = _type_1;
      }
    }
    if (!_matched) {
      _switchResult = ADSLTypeProvider.nullType;
    }
    return _switchResult;
  }
}
