package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class n01 {
    public static final n01 n;
    public static final n01 o;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public boolean a;
        public boolean b;
        public int c = -1;
        public boolean d;

        public final n01 a() {
            return new n01(this.a, this.b, -1, -1, false, false, false, this.c, -1, this.d, false, false, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        /* JADX WARN: Code duplicated, block: B:108:0x0064 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:109:0x006a A[EDGE_INSN: B:109:0x006a->B:22:0x006a BREAK  A[LOOP:2: B:16:0x004c->B:20:0x005d], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:15:0x0047  */
        /* JADX WARN: Code duplicated, block: B:17:0x004e  */
        /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:2: B:16:0x004c->B:20:0x005d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:54:0x0105  */
        /* JADX WARN: Code duplicated, block: B:56:0x010e  */
        /* JADX WARN: Code duplicated, block: B:58:0x0116  */
        /* JADX WARN: Code duplicated, block: B:59:0x011c  */
        /* JADX WARN: Code duplicated, block: B:61:0x0124  */
        /* JADX WARN: Code duplicated, block: B:63:0x012d  */
        /* JADX WARN: Code duplicated, block: B:65:0x0136  */
        /* JADX WARN: Code duplicated, block: B:66:0x013b  */
        /* JADX WARN: Code duplicated, block: B:68:0x0143  */
        /* JADX WARN: Code duplicated, block: B:69:0x0149  */
        /* JADX WARN: Code duplicated, block: B:71:0x0151  */
        /* JADX WARN: Code duplicated, block: B:72:0x0157  */
        /* JADX WARN: Code duplicated, block: B:74:0x015f  */
        /* JADX WARN: Code duplicated, block: B:75:0x0165  */
        /* JADX WARN: Code duplicated, block: B:77:0x016d  */
        /* JADX WARN: Code duplicated, block: B:78:0x0175  */
        /* JADX WARN: Code duplicated, block: B:80:0x017d  */
        /* JADX WARN: Code duplicated, block: B:81:0x0183  */
        /* JADX WARN: Code duplicated, block: B:83:0x018c  */
        /* JADX WARN: Code duplicated, block: B:84:0x0193  */
        /* JADX WARN: Code duplicated, block: B:86:0x019b  */
        /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
        public static n01 a(nu4 nu4Var) {
            int i;
            int length;
            int length2;
            int i2;
            String string;
            String string2;
            nu4 nu4Var2 = nu4Var;
            nu4Var2.getClass();
            int size = nu4Var2.size();
            int i3 = 0;
            boolean z = true;
            String str = null;
            boolean z2 = false;
            boolean z3 = false;
            int iP = -1;
            int iP2 = -1;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            int iP3 = -1;
            int iP4 = -1;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            while (i3 < size) {
                String strE = nu4Var2.e(i3);
                String strJ = nu4Var2.j(i3);
                if (strE.equalsIgnoreCase("Cache-Control")) {
                    if (str == null) {
                        str = strJ;
                    }
                    i = 0;
                    while (i < strJ.length()) {
                        length = strJ.length();
                        length2 = i;
                        while (true) {
                            if (length2 < length) {
                                i2 = size;
                                length2 = strJ.length();
                                break;
                            }
                            i2 = size;
                            if (z2a.p("=,;", strJ.charAt(length2))) {
                                break;
                            }
                            length2++;
                            size = i2;
                        }
                        string = z2a.R(strJ.substring(i, length2)).toString();
                        if (length2 != strJ.length() || strJ.charAt(length2) == ',' || strJ.charAt(length2) == ';') {
                            i = length2 + 1;
                            string2 = null;
                        } else {
                            int length3 = length2 + 1;
                            byte[] bArr = vtb.a;
                            int length4 = strJ.length();
                            while (true) {
                                if (length3 < length4) {
                                    char cCharAt = strJ.charAt(length3);
                                    if (cCharAt != ' ' && cCharAt != '\t') {
                                        break;
                                    }
                                    length3++;
                                } else {
                                    length3 = strJ.length();
                                    break;
                                }
                            }
                            if (length3 >= strJ.length() || strJ.charAt(length3) != '\"') {
                                int length5 = strJ.length();
                                int length6 = length3;
                                while (true) {
                                    if (length6 >= length5) {
                                        length6 = strJ.length();
                                        break;
                                    }
                                    int i4 = length5;
                                    if (z2a.p(",;", strJ.charAt(length6))) {
                                        break;
                                    }
                                    length6++;
                                    length5 = i4;
                                }
                                int i5 = length6;
                                string2 = z2a.R(strJ.substring(length3, length6)).toString();
                                i = i5;
                            } else {
                                int i6 = length3 + 1;
                                int iT = z2a.t(strJ, '\"', i6, 4);
                                string2 = strJ.substring(i6, iT);
                                i = iT + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z3 = true;
                        } else if ("max-age".equalsIgnoreCase(string)) {
                            iP = vtb.p(-1, string2);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iP2 = vtb.p(-1, string2);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iP3 = vtb.p(Integer.MAX_VALUE, string2);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            iP4 = vtb.p(-1, string2);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z9 = true;
                        }
                        size = i2;
                    }
                    i3++;
                    nu4Var2 = nu4Var;
                    size = size;
                } else {
                    if (strE.equalsIgnoreCase("Pragma")) {
                    }
                    i3++;
                    nu4Var2 = nu4Var;
                    size = size;
                }
                z = false;
                i = 0;
                while (i < strJ.length()) {
                    length = strJ.length();
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            i2 = size;
                            length2 = strJ.length();
                            break;
                        }
                        i2 = size;
                        if (z2a.p("=,;", strJ.charAt(length2))) {
                            break;
                            break;
                        }
                        length2++;
                        size = i2;
                    }
                    string = z2a.R(strJ.substring(i, length2)).toString();
                    if (length2 != strJ.length()) {
                        i = length2 + 1;
                        string2 = null;
                    } else {
                        i = length2 + 1;
                        string2 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iP = vtb.p(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iP2 = vtb.p(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iP3 = vtb.p(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iP4 = vtb.p(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z9 = true;
                    }
                    size = i2;
                }
                i3++;
                nu4Var2 = nu4Var;
                size = size;
            }
            return new n01(z2, z3, iP, iP2, z4, z5, z6, iP3, iP4, z7, z8, z9, !z ? null : str);
        }
    }

    static {
        a aVar = new a();
        aVar.a = true;
        n = aVar.a();
        a aVar2 = new a();
        aVar2.d = true;
        l93.a aVar3 = l93.u;
        q93 q93Var = q93.SECONDS;
        long j = l93.j(o93.f(Integer.MAX_VALUE, q93Var), q93Var);
        if (j < 0) {
            ca0.a(d43.b(j, "maxStale < 0: "));
        } else {
            aVar2.c = j <= 2147483647L ? (int) j : Integer.MAX_VALUE;
            o = aVar2.a();
        }
    }

    public n01(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    public final String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        int i = this.c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.h;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.i;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String string = sb.toString();
        this.m = string;
        return string;
    }
}
