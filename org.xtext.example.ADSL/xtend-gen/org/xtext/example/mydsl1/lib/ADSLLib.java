package org.xtext.example.mydsl1.lib;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.mydsl1.aDSL.XClass;
import org.xtext.example.mydsl1.scoping.ADSLIndex;
import org.xtext.example.mydsl1.util.ADSLUtil;

@SuppressWarnings("all")
public class ADSLLib {
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Inject
  @Extension
  private ADSLIndex _aDSLIndex;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  public final static String LIB_PACKAGE = "adsl.lang";
  
  public final static String LIB_OBJECT = (ADSLLib.LIB_PACKAGE + ".Object");
  
  public final static String LIB_STRING = (ADSLLib.LIB_PACKAGE + ".String");
  
  public final static String LIB_INTEGER = (ADSLLib.LIB_PACKAGE + ".Integer");
  
  public final static String LIB_BOOLEAN = (ADSLLib.LIB_PACKAGE + ".Boolean");
  
  public final static String LIB_PLACE = (ADSLLib.LIB_PACKAGE + ".Place");
  
  public final static String MAIN_LIB = "adsl/lang/main.adsl";
  
  public ResourceSet loadLib() {
    ResourceSet _xblockexpression = null;
    {
      Class<? extends ADSLLib> _class = this.getClass();
      ClassLoader _classLoader = _class.getClassLoader();
      final InputStream stream = _classLoader.getResourceAsStream(ADSLLib.MAIN_LIB);
      ResourceSet _get = this.resourceSetProvider.get();
      final Procedure1<ResourceSet> _function = (ResourceSet resourceSet) -> {
        try {
          URI _createURI = URI.createURI(ADSLLib.MAIN_LIB);
          final Resource resource = resourceSet.createResource(_createURI);
          Map<Object, Object> _loadOptions = resourceSet.getLoadOptions();
          resource.load(stream, _loadOptions);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _xblockexpression = ObjectExtensions.<ResourceSet>operator_doubleArrow(_get, _function);
    }
    return _xblockexpression;
  }
  
  public ArrayList<XClass> getClassHierarchyWithObject(final XClass c) {
    ArrayList<XClass> _xblockexpression = null;
    {
      ArrayList<XClass> hierarchy = ADSLUtil.classHierarchy(c);
      XClass _last = IterableExtensions.<XClass>last(hierarchy);
      QualifiedName _fullyQualifiedName = null;
      if (_last!=null) {
        _fullyQualifiedName=this._iQualifiedNameProvider.getFullyQualifiedName(_last);
      }
      String _string = null;
      if (_fullyQualifiedName!=null) {
        _string=_fullyQualifiedName.toString();
      }
      boolean _notEquals = (!Objects.equal(_string, ADSLLib.LIB_OBJECT));
      if (_notEquals) {
        final XClass adslObjectClass = this.getADSLObjectClass(c);
        boolean _notEquals_1 = (!Objects.equal(adslObjectClass, null));
        if (_notEquals_1) {
          hierarchy.add(adslObjectClass);
        }
      }
      _xblockexpression = hierarchy;
    }
    return _xblockexpression;
  }
  
  public XClass getSuperclassOrObject(final XClass c) {
    XClass _elvis = null;
    XClass _superclass = c.getSuperclass();
    if (_superclass != null) {
      _elvis = _superclass;
    } else {
      XClass _aDSLObjectClass = this.getADSLObjectClass(c);
      _elvis = _aDSLObjectClass;
    }
    return _elvis;
  }
  
  public XClass getADSLObjectClass(final EObject context) {
    XClass _xblockexpression = null;
    {
      Iterable<IEObjectDescription> _visibleClassesDescriptions = this._aDSLIndex.getVisibleClassesDescriptions(context);
      final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
        QualifiedName _qualifiedName = it.getQualifiedName();
        String _string = _qualifiedName.toString();
        return Boolean.valueOf(Objects.equal(_string, ADSLLib.LIB_OBJECT));
      };
      final IEObjectDescription desc = IterableExtensions.<IEObjectDescription>findFirst(_visibleClassesDescriptions, _function);
      boolean _equals = Objects.equal(desc, null);
      if (_equals) {
        return null;
      }
      EObject o = desc.getEObjectOrProxy();
      boolean _eIsProxy = o.eIsProxy();
      if (_eIsProxy) {
        Resource _eResource = context.eResource();
        ResourceSet _resourceSet = _eResource.getResourceSet();
        URI _eObjectURI = desc.getEObjectURI();
        EObject _eObject = _resourceSet.getEObject(_eObjectURI, true);
        o = _eObject;
      }
      _xblockexpression = ((XClass) o);
    }
    return _xblockexpression;
  }
}
