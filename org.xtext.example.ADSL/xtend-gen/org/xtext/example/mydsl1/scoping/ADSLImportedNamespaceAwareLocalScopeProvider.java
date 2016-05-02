package org.xtext.example.mydsl1.scoping;

import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class ADSLImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Override
  public List<ImportNormalizer> getImplicitImports(final boolean ignoreCase) {
    QualifiedName _create = QualifiedName.create("adsl", "lang");
    ImportNormalizer _importNormalizer = new ImportNormalizer(_create, true, ignoreCase);
    return CollectionLiterals.<ImportNormalizer>newArrayList(_importNormalizer);
  }
}
