package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yt7 {
    public String a;
    public wi4 b;
    public int c;
    public int d;

    public final int a() {
        wi4 wi4Var = this.b;
        String str = this.a;
        if (wi4Var == null) {
            return str.length();
        }
        return (wi4Var.a - wi4Var.a()) + (str.length() - (this.d - this.c));
    }

    public final void b(int i, int i2, String str) {
        if (i > i2) {
            vc5.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            vc5.a("start must be non-negative, but was " + i);
        }
        wi4 wi4Var = this.b;
        if (wi4Var == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.a.length() - i2, 64);
            String str2 = this.a;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = this.a;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            wi4 wi4Var2 = new wi4();
            wi4Var2.a = iMax;
            wi4Var2.b = cArr;
            wi4Var2.c = length;
            wi4Var2.d = i4;
            this.b = wi4Var2;
            this.c = i3;
            this.d = i5;
            return;
        }
        int i6 = this.c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > wi4Var.a - wi4Var.a()) {
            this.a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            b(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > wi4Var.a()) {
            int iA = length2 - wi4Var.a();
            int i9 = wi4Var.a;
            do {
                i9 *= 2;
            } while (i9 - wi4Var.a < iA);
            char[] cArr2 = new char[i9];
            System.arraycopy(wi4Var.b, 0, cArr2, 0, wi4Var.c);
            int i10 = wi4Var.a;
            int i11 = wi4Var.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy(wi4Var.b, i11, cArr2, i13, (i12 + i11) - i11);
            wi4Var.b = cArr2;
            wi4Var.a = i9;
            wi4Var.d = i13;
        }
        int i14 = wi4Var.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = wi4Var.b;
            System.arraycopy(cArr3, i8, cArr3, wi4Var.d - i15, i15);
            wi4Var.c = i7;
            wi4Var.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iA2 = wi4Var.a() + i7;
            int iA3 = wi4Var.a() + i8;
            int i16 = wi4Var.d;
            int i17 = iA2 - i16;
            char[] cArr4 = wi4Var.b;
            System.arraycopy(cArr4, i16, cArr4, wi4Var.c, i17);
            wi4Var.c += i17;
            wi4Var.d = iA3;
        } else {
            wi4Var.d = wi4Var.a() + i8;
            wi4Var.c = i7;
        }
        str.getChars(0, str.length(), wi4Var.b, wi4Var.c);
        wi4Var.c = str.length() + wi4Var.c;
    }

    public final String toString() {
        wi4 wi4Var = this.b;
        String str = this.a;
        if (wi4Var == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, this.c);
        sb.append(wi4Var.b, 0, wi4Var.c);
        char[] cArr = wi4Var.b;
        int i = wi4Var.d;
        sb.append(cArr, i, wi4Var.a - i);
        String str2 = this.a;
        sb.append((CharSequence) str2, this.d, str2.length());
        return sb.toString();
    }
}
