package org.xtext.example.mydsl1.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.xtext.example.mydsl1.aDSL.Block;
import org.xtext.example.mydsl1.aDSL.Member;
import org.xtext.example.mydsl1.aDSL.Method;
import org.xtext.example.mydsl1.aDSL.Program;
import org.xtext.example.mydsl1.aDSL.SharedDef;
import org.xtext.example.mydsl1.aDSL.VariableDef;
import org.xtext.example.mydsl1.aDSL.XClass;

@SuppressWarnings("all")
public class ADSLUtil {
  public static ArrayList<XClass> classHierarchy(final XClass c) {
    ArrayList<XClass> _xblockexpression = null;
    {
      final ArrayList<XClass> visited = CollectionLiterals.<XClass>newArrayList();
      XClass current = c.getSuperclass();
      while (((!Objects.equal(current, null)) && (!visited.contains(current)))) {
        {
          visited.add(current);
          XClass _superclass = current.getSuperclass();
          current = _superclass;
        }
      }
      _xblockexpression = visited;
    }
    return _xblockexpression;
  }
  
  public static Iterable<EObject> fields(final XClass c) {
    EList<Member> _members = c.getMembers();
    Iterable<VariableDef> _filter = Iterables.<VariableDef>filter(_members, VariableDef.class);
    EList<Member> _members_1 = c.getMembers();
    Iterable<SharedDef> _filter_1 = Iterables.<SharedDef>filter(_members_1, SharedDef.class);
    return Iterables.<EObject>concat(_filter, _filter_1);
  }
  
  public static Iterable<Method> methods(final XClass c) {
    EList<Member> _members = c.getMembers();
    return Iterables.<Method>filter(_members, Method.class);
  }
  
  public static XClass containingXClass(final EObject e) {
    return EcoreUtil2.<XClass>getContainerOfType(e, XClass.class);
  }
  
  public static Method containingMethod(final EObject e) {
    return EcoreUtil2.<Method>getContainerOfType(e, Method.class);
  }
  
  public static Program containingProgram(final EObject e) {
    return EcoreUtil2.<Program>getContainerOfType(e, Program.class);
  }
  
  public static Block containingBlock(final EObject e) {
    return EcoreUtil2.<Block>getContainerOfType(e, Block.class);
  }
}
