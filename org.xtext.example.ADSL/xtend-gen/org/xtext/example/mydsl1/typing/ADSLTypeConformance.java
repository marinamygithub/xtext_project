package org.xtext.example.mydsl1.typing;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl1.aDSL.XClass;
import org.xtext.example.mydsl1.lib.ADSLLib;
import org.xtext.example.mydsl1.typing.ADSLTypeProvider;
import org.xtext.example.mydsl1.util.ADSLUtil;

@SuppressWarnings("all")
public class ADSLTypeConformance {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  public boolean isConformant(final XClass c1, final XClass c2) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _or_3 = false;
    boolean _equals = Objects.equal(c1, ADSLTypeProvider.nullType);
    if (_equals) {
      _or_3 = true;
    } else {
      boolean _conformToLibraryTypes = this.conformToLibraryTypes(c1, c2);
      _or_3 = _conformToLibraryTypes;
    }
    if (_or_3) {
      _or_2 = true;
    } else {
      boolean _equals_1 = Objects.equal(c1, c2);
      _or_2 = _equals_1;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(c2);
      String _string = _fullyQualifiedName.toString();
      boolean _equals_2 = Objects.equal(_string, ADSLLib.LIB_OBJECT);
      _or_1 = _equals_2;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _isSubclassOf = this.isSubclassOf(c1, c2);
      _or = _isSubclassOf;
    }
    return _or;
  }
  
  public boolean conformToLibraryTypes(final XClass c1, final XClass c2) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _and = false;
    boolean _conformsToString = this.conformsToString(c1);
    if (!_conformsToString) {
      _and = false;
    } else {
      boolean _conformsToString_1 = this.conformsToString(c2);
      _and = _conformsToString_1;
    }
    if (_and) {
      _or_1 = true;
    } else {
      boolean _and_1 = false;
      boolean _conformsToInt = this.conformsToInt(c1);
      if (!_conformsToInt) {
        _and_1 = false;
      } else {
        boolean _conformsToInt_1 = this.conformsToInt(c2);
        _and_1 = _conformsToInt_1;
      }
      _or_1 = _and_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _and_2 = false;
      boolean _conformsToBoolean = this.conformsToBoolean(c1);
      if (!_conformsToBoolean) {
        _and_2 = false;
      } else {
        boolean _conformsToBoolean_1 = this.conformsToBoolean(c2);
        _and_2 = _conformsToBoolean_1;
      }
      _or = _and_2;
    }
    return _or;
  }
  
  public boolean conformsToString(final XClass c) {
    boolean _or = false;
    boolean _equals = Objects.equal(c, ADSLTypeProvider.stringType);
    if (_equals) {
      _or = true;
    } else {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(c);
      String _string = _fullyQualifiedName.toString();
      boolean _equals_1 = Objects.equal(_string, ADSLLib.LIB_STRING);
      _or = _equals_1;
    }
    return _or;
  }
  
  public boolean conformsToInt(final XClass c) {
    boolean _or = false;
    boolean _equals = Objects.equal(c, ADSLTypeProvider.intType);
    if (_equals) {
      _or = true;
    } else {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(c);
      String _string = _fullyQualifiedName.toString();
      boolean _equals_1 = Objects.equal(_string, ADSLLib.LIB_INTEGER);
      _or = _equals_1;
    }
    return _or;
  }
  
  public boolean conformsToBoolean(final XClass c) {
    boolean _or = false;
    boolean _equals = Objects.equal(c, ADSLTypeProvider.booleanType);
    if (_equals) {
      _or = true;
    } else {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(c);
      String _string = _fullyQualifiedName.toString();
      boolean _equals_1 = Objects.equal(_string, ADSLLib.LIB_BOOLEAN);
      _or = _equals_1;
    }
    return _or;
  }
  
  public boolean isSubclassOf(final XClass c1, final XClass c2) {
    ArrayList<XClass> _classHierarchy = ADSLUtil.classHierarchy(c1);
    return _classHierarchy.contains(c2);
  }
}
