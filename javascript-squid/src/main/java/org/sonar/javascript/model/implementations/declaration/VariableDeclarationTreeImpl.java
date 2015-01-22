/*
 * SonarQube JavaScript Plugin
 * Copyright (C) 2011 SonarSource and Eriks Nukis
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.javascript.model.implementations.declaration;

import com.google.common.collect.Iterators;
import com.sonar.sslr.api.AstNode;
import org.sonar.javascript.model.implementations.JavaScriptTree;
import org.sonar.javascript.model.interfaces.Tree;
import org.sonar.javascript.model.interfaces.expression.ExpressionTree;
import org.sonar.javascript.model.interfaces.lexical.SyntaxToken;
import org.sonar.javascript.model.interfaces.declaration.VariableDeclarationTree;

import javax.annotation.Nullable;
import java.util.Iterator;

public class VariableDeclarationTreeImpl extends JavaScriptTree implements VariableDeclarationTree {

  public VariableDeclarationTreeImpl(AstNode bindingIdentifier) {
    super(Kind.VARIABLE_DECLARATION);

    addChildren(bindingIdentifier);
  }

  public VariableDeclarationTreeImpl(AstNode bindingIdentifier, AstNode initialiser) {
    super(Kind.VARIABLE_DECLARATION);

    addChildren(bindingIdentifier, initialiser);
  }

  @Override
  public Kind getKind() {
    return Kind.VARIABLE_DECLARATION;
  }

  @Override
  public ExpressionTree identifier() {
    throw new UnsupportedOperationException("Not supported yet in the strongly typed AST.");
  }

  @Nullable
  @Override
  public SyntaxToken equalToken() {
    throw new UnsupportedOperationException("Not supported yet in the strongly typed AST.");
  }

  @Nullable
  @Override
  public Tree initialiser() {
    throw new UnsupportedOperationException("Not supported yet in the strongly typed AST.");
  }

  @Override
  public Iterator<Tree> childrenIterator() {
    return Iterators.emptyIterator();
  }

}