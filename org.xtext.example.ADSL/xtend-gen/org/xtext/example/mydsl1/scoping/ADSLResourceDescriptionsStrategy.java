package org.xtext.example.mydsl1.scoping;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl1.aDSL.Program;
import org.xtext.example.mydsl1.aDSL.XClass;

/**
 * If you enable this strategy, the NamesAreUniqueValidator will not
 * work as expected.
 */
@Singleton
@SuppressWarnings("all")
public class ADSLResourceDescriptionsStrategy extends DefaultResourceDescriptionStrategy {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public boolean createEObjectDescriptions(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
    boolean _xifexpression = false;
    if ((eObject instanceof Program)) {
      boolean _xblockexpression = false;
      {
        EList<XClass> _xclass = ((Program) eObject).getXclass();
        final Consumer<XClass> _function = (XClass XClass) -> {
          final QualifiedName fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(XClass);
          boolean _notEquals = (!Objects.equal(fullyQualifiedName, null));
          if (_notEquals) {
            IEObjectDescription _create = EObjectDescription.create(fullyQualifiedName, XClass);
            acceptor.accept(_create);
          }
        };
        _xclass.forEach(_function);
        _xblockexpression = true;
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = false;
    }
    return _xifexpression;
  }
}
