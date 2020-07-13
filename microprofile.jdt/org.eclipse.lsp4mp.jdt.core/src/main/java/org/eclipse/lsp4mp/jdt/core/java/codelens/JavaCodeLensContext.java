/*******************************************************************************
* Copyright (c) 2020 Red Hat Inc. and others.
* All rights reserved. This program and the accompanying materials
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v20.html
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors:
*     Red Hat Inc. - initial API and implementation
*******************************************************************************/
package org.eclipse.lsp4mp.jdt.core.java.codelens;

import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.lsp4mp.commons.MicroProfileJavaCodeLensParams;
import org.eclipse.lsp4mp.jdt.core.java.AbtractJavaContext;
import org.eclipse.lsp4mp.jdt.core.utils.IJDTUtils;

/**
 * Java codeLens context for a given compilation unit.
 * 
 * @author Angelo ZERR
 *
 */
public class JavaCodeLensContext extends AbtractJavaContext {

	private final MicroProfileJavaCodeLensParams params;

	public JavaCodeLensContext(String uri, ITypeRoot typeRoot, IJDTUtils utils, MicroProfileJavaCodeLensParams params) {
		super(uri, typeRoot, utils);
		this.params = params;
	}

	public MicroProfileJavaCodeLensParams getParams() {
		return params;
	}

}