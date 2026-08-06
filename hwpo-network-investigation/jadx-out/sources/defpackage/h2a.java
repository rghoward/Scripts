package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class h2a {
    public final xl5 a;
    public int b;
    public final cn5 c;
    public String d;
    public final StringBuilder e;
    public final String f;

    public h2a(String str, xl5 xl5Var) {
        str.getClass();
        this.a = xl5Var;
        this.c = new cn5(xl5Var);
        this.e = new StringBuilder();
        this.f = str;
    }

    public static /* synthetic */ void m(h2a h2aVar, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = h2aVar.b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        h2aVar.l(i, str, str2);
        throw null;
    }

    public final int a(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.e.append((char) (n(charSequence, i + 3) + (n(charSequence, i) << 12) + (n(charSequence, i + 1) << 8) + (n(charSequence, i + 2) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return a(charSequence, this.b);
        }
        m(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length()) {
                this.b = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
    }

    public final void c(int i, String str) {
        if (o().length() - i < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (o().charAt(i + i2) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public final String d() {
        String string;
        g('\"');
        int i = this.b;
        String str = this.f;
        int iT = z2a.t(str, '\"', i, 4);
        if (iT == -1) {
            j();
            int i2 = this.b;
            m(this, sk0.c("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iT) {
            if (str.charAt(i3) == '\\') {
                int iS = this.b;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (true) {
                    StringBuilder sb = this.e;
                    if (cCharAt == '\"') {
                        if (z) {
                            sb.append((CharSequence) o(), iS, i3);
                            string = sb.toString();
                            sb.setLength(0);
                        } else {
                            string = o().subSequence(iS, i3).toString();
                        }
                        this.b = i3 + 1;
                        return string;
                    }
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) o(), iS, i3);
                        int iS2 = s(i3 + 1);
                        if (iS2 == -1) {
                            m(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iS2 + 1;
                        char cCharAt2 = str.charAt(iS2);
                        if (cCharAt2 == 'u') {
                            iA = a(str, iA);
                        } else {
                            char c = cCharAt2 < 'u' ? oa1.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iS = s(iA);
                        if (iS == -1) {
                            m(this, "Unexpected EOF", iS, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) o(), iS, i3);
                            iS = s(i3);
                            if (iS == -1) {
                                m(this, "Unexpected EOF", iS, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iS;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
            } else {
                i3++;
            }
        }
        this.b = iT + 1;
        return str.substring(i, iT);
    }

    public byte e() {
        String str;
        int i = this.b;
        while (true) {
            str = this.f;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                return bw5.a(cCharAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    public final byte f(byte b) {
        byte bE = e();
        if (bE == b) {
            return bE;
        }
        String strC = bw5.c(b);
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        m(this, op3.a("Expected ", strC, ", but had '", (i == o().length() || i2 < 0) ? "EOF" : String.valueOf(o().charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public void g(char c) {
        int i = this.b;
        if (i == -1) {
            v(c);
            throw null;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length()) {
                this.b = -1;
                v(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                v(c);
                throw null;
            }
            i = i2;
        }
    }

    public final long h() {
        boolean z;
        boolean z2;
        boolean z3;
        double dPow;
        int iS = s(t());
        if (iS >= o().length() || iS == -1) {
            m(this, "EOF", 0, null, 6);
            throw null;
        }
        if (o().charAt(iS) == '\"') {
            iS++;
            if (iS == o().length()) {
                m(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iS;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j = 0;
        long j2 = 0;
        while (true) {
            if (i == o().length()) {
                z = z;
                z2 = z5;
                z3 = z6;
                break;
            }
            char cCharAt = o().charAt(i);
            z = z;
            if ((cCharAt != 'e' && cCharAt != 'E') || z5) {
                z2 = z5;
                if (cCharAt == '-' && z2) {
                    if (i == iS) {
                        m(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z5 = z2;
                    z4 = false;
                } else if (cCharAt != '+' || !z2) {
                    z3 = z6;
                    if (cCharAt != '-') {
                        if (bw5.a(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            m(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                            throw null;
                        }
                        if (z2) {
                            j = (j * 10) + ((long) i3);
                        } else {
                            j2 = (j2 * 10) - ((long) i3);
                            if (j2 > 0) {
                                m(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        i = i2;
                        z5 = z2;
                        z6 = z3;
                    } else {
                        if (i != iS) {
                            m(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z5 = z2;
                        z6 = true;
                    }
                } else {
                    if (i == iS) {
                        m(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z5 = z2;
                    z4 = true;
                }
            } else {
                if (i == iS) {
                    m(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                    throw null;
                }
                i++;
                z4 = true;
                z5 = true;
            }
        }
        boolean z7 = i != iS;
        if (iS == i || (z3 && iS == i - 1)) {
            m(this, "Expected numeric literal", i, null, 4);
            throw null;
        }
        if (z) {
            if (!z7) {
                m(this, "EOF", 0, null, 6);
                throw null;
            }
            if (o().charAt(i) != '\"') {
                m(this, "Expected closing quotation mark", i, null, 4);
                throw null;
            }
            i++;
        }
        this.b = i;
        if (z2) {
            double d = j2;
            if (!z4) {
                dPow = Math.pow(10.0d, -j);
            } else {
                if (!z4) {
                    u.b();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                m(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                m(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j2 = (long) d2;
        }
        if (z3) {
            return j2;
        }
        if (j2 != Long.MIN_VALUE) {
            return -j2;
        }
        m(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public final String i() {
        String str = this.d;
        if (str == null) {
            return d();
        }
        str.getClass();
        this.d = null;
        return str;
    }

    public final String j() {
        String string;
        String str = this.d;
        if (str != null) {
            str.getClass();
            this.d = null;
            return str;
        }
        int iT = t();
        if (iT >= o().length() || iT == -1) {
            m(this, "EOF", iT, null, 4);
            throw null;
        }
        byte bA = bw5.a(o().charAt(iT));
        if (bA == 1) {
            return i();
        }
        if (bA != 0) {
            m(this, "Expected beginning of the string, but got " + o().charAt(iT), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (true) {
            byte bA2 = bw5.a(o().charAt(iT));
            StringBuilder sb = this.e;
            if (bA2 != 0) {
                int i = this.b;
                if (z) {
                    sb.append((CharSequence) o(), i, iT);
                    string = sb.toString();
                    sb.setLength(0);
                } else {
                    string = o().subSequence(i, iT).toString();
                }
                this.b = iT;
                return string;
            }
            iT++;
            if (iT >= o().length()) {
                sb.append((CharSequence) o(), this.b, iT);
                int iS = s(iT);
                if (iS == -1) {
                    this.b = iT;
                    sb.append((CharSequence) o(), 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iT = iS;
                z = true;
            }
        }
    }

    public final String k() {
        String strJ = j();
        if (!xj5.a(strJ, "null") || o().charAt(this.b - 1) == '\"') {
            return strJ;
        }
        m(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public final void l(int i, String str, String str2) {
        String strA = this.c.a();
        String strO = o();
        strO.getClass();
        throw new gm5(ha7.d(str, strA, str2, this.a.i ? ha7.h(strO, i).toString() : null, i));
    }

    public final int n(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public final String o() {
        return this.f;
    }

    public final String p(String str, boolean z) {
        str.getClass();
        int i = this.b;
        try {
            if (e() == 6 && xj5.a(r(z), str)) {
                this.d = null;
                if (e() == 5) {
                    return r(z);
                }
            }
            return null;
        } finally {
            this.b = i;
            this.d = null;
        }
    }

    public byte q() {
        String strO = o();
        int i = this.b;
        while (true) {
            int iS = s(i);
            if (iS == -1) {
                this.b = iS;
                return (byte) 10;
            }
            char cCharAt = strO.charAt(iS);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iS;
                return bw5.a(cCharAt);
            }
            i = iS + 1;
        }
    }

    public final String r(boolean z) {
        String strI;
        byte bQ = q();
        if (z) {
            if (bQ != 1 && bQ != 0) {
                return null;
            }
            strI = j();
        } else {
            if (bQ != 1) {
                return null;
            }
            strI = i();
        }
        this.d = strI;
        return strI;
    }

    public final int s(int i) {
        if (i < this.f.length()) {
            return i;
        }
        return -1;
    }

    public int t() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.b = i;
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) o());
        sb.append("', currentPosition=");
        return e44.a(sb, this.b, ')');
    }

    public final boolean u() {
        int iT = t();
        String strO = o();
        if (iT >= strO.length() || iT == -1 || strO.charAt(iT) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public final void v(char c) {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strJ = j();
                this.b = i;
                if (xj5.a(strJ, "null")) {
                    l(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String strC = bw5.c(bw5.a(c));
        int i2 = this.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        String str = this.f;
        m(this, op3.a("Expected ", strC, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }
}
