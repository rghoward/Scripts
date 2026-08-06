package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vq5 {
    public final Layout a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean[] d;
    public char[] e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final int b;
        public final boolean c;

        public a(int i, boolean z, int i2) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + os2.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BidiRun(start=");
            sb.append(this.a);
            sb.append(", end=");
            sb.append(this.b);
            sb.append(", isRtl=");
            return pi1.a(sb, this.c, ')');
        }
    }

    public vq5(Layout layout) {
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iT = z2a.t(this.a.getText(), '\n', length, 4);
            length = iT < 0 ? this.a.getText().length() : iT + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.a.getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[this.b.size()];
        this.b.size();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    public final Bidi a(int i) {
        Bidi bidi;
        boolean[] zArr = this.d;
        boolean z = zArr[i];
        ArrayList arrayList = this.c;
        if (z) {
            return (Bidi) arrayList.get(i);
        }
        ArrayList arrayList2 = this.b;
        int iIntValue = i == 0 ? 0 : ((Number) arrayList2.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList2.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = this.e;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        Layout layout = this.a;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(e(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = this.e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.e = cArr2;
        return bidi;
    }

    public final float b(int i, boolean z) {
        Layout layout = this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public final float c(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        if (!z2) {
            return b(i, z);
        }
        Layout layout = this.a;
        int iG = ty1.g(layout, i, z2);
        int lineStart = layout.getLineStart(iG);
        int lineEnd = layout.getLineEnd(iG);
        if (i != lineStart && i != lineEnd) {
            return b(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return b(i, z);
        }
        int iD = d(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(e(iD))) == -1;
        int iF = f(lineEnd, lineStart);
        int iE = e(iD);
        int i4 = lineStart - iE;
        int i5 = iF - iE;
        Bidi bidiA = a(iD);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iG) : layout.getLineRight(iG);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            aVarArr[i6] = new a(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1, bidiCreateLineBidi.getRunLimit(i6) + lineStart);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (aVarArr[i8].a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == aVarArr[i3].c) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iG);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(aVarArr[i3 - 1].a) : layout.getPrimaryHorizontal(aVarArr[i3 + 1].a);
            }
            return layout.getLineRight(iG);
        }
        int iF2 = i > iF ? f(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (aVarArr[i9].b == iF2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == aVarArr[i2].c) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iG);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(aVarArr[i2 - 1].b) : layout.getPrimaryHorizontal(aVarArr[i2 + 1].b);
        }
        return layout.getLineRight(iG);
    }

    public final int d(int i, boolean z) {
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = this.b;
        int iD = ws0.d(arrayList, numValueOf);
        int i2 = iD < 0 ? -(iD + 1) : iD + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int e(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) this.b.get(i - 1)).intValue();
    }

    public final int f(int i, int i2) {
        while (i > i2) {
            char cCharAt = this.a.getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((xj5.b(cCharAt, 8192) < 0 || xj5.b(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }
}
