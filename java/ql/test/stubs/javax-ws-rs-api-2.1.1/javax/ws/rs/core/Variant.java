/*
 * Copyright (c) 2010, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.ws.rs.core;
import java.util.List;
import java.util.Locale;

public class Variant {
    public Variant(MediaType mediaType, String language, String encoding) {
    }

    public Variant(MediaType mediaType, String language, String country, String encoding) {
    }

    public Variant(MediaType mediaType, String language, String country, String languageVariant, String encoding) {
    }

    public Variant(MediaType mediaType, Locale language, String encoding) {
    }

    public Locale getLanguage() {
      return null;
    }

    public String getLanguageString() {
      return null;
    }

    public MediaType getMediaType() {
      return null;
    }

    public String getEncoding() {
      return null;
    }

    public static VariantListBuilder mediaTypes(MediaType... mediaTypes) {
      return null;
    }

    public static VariantListBuilder languages(Locale... languages) {
      return null;
    }

    public static VariantListBuilder encodings(String... encodings) {
      return null;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    @Override
    public boolean equals(Object obj) {
      return false;
    }

    @Override
    public String toString() {
      return null;
    }

    public static abstract class VariantListBuilder {
        public static VariantListBuilder newInstance() {
          return null;
        }

        public abstract List<Variant> build();

        public abstract VariantListBuilder add();

        public abstract VariantListBuilder languages(Locale... languages);

        public abstract VariantListBuilder encodings(String... encodings);

        public abstract VariantListBuilder mediaTypes(MediaType... mediaTypes);

    }
}
