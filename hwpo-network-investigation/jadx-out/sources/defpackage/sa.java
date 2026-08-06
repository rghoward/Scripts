package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sa {
    public static final sa c = new sa(new a[0]);
    public static final a d;
    public final int a;
    public final a[] b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final int b;

        @Deprecated
        public final Uri[] c;
        public final co6[] d;
        public final int[] e;
        public final long[] f;
        public final String[] g;
        public final b[] h;

        static {
            ra.b(0, 1, 2, 3, 4);
            ra.b(5, 6, 7, 8, 9);
            n6b.H(10);
            n6b.H(11);
        }

        public a(int i, int i2, int[] iArr, co6[] co6VarArr, long[] jArr, String[] strArr, b[] bVarArr) {
            Uri uri;
            int i3 = 0;
            xl7.g(iArr.length == co6VarArr.length);
            xl7.g(iArr.length == bVarArr.length);
            this.a = i;
            this.b = i2;
            this.e = iArr;
            this.d = co6VarArr;
            this.f = jArr;
            this.c = new Uri[co6VarArr.length];
            while (true) {
                Uri[] uriArr = this.c;
                if (i3 >= uriArr.length) {
                    this.g = strArr;
                    this.h = bVarArr;
                    return;
                }
                co6 co6Var = co6VarArr[i3];
                if (co6Var == null) {
                    uri = null;
                } else {
                    co6.f fVar = co6Var.b;
                    fVar.getClass();
                    uri = fVar.a;
                }
                uriArr[i3] = uri;
                i3++;
            }
        }

        public final int a(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.e;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f, aVar.f) && Arrays.equals(this.g, aVar.g) && Arrays.equals(this.h, aVar.h);
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.h) + ((((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.a * 31) + this.b) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.g)) * 31)) * 31;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        static {
            n6b.H(0);
            n6b.H(1);
            n6b.H(2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hash(0L, 0L, null);
        }
    }

    static {
        a aVar = new a(-1, -1, new int[0], new co6[0], new long[0], new String[0], new b[0]);
        int[] iArr = aVar.e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        co6[] co6VarArr = (co6[]) Arrays.copyOf(aVar.d, 0);
        String[] strArr = (String[]) Arrays.copyOf(aVar.g, 0);
        b[] bVarArr = aVar.h;
        d = new a(0, aVar.b, iArrCopyOf, co6VarArr, jArrCopyOf, strArr, (b[]) Arrays.copyOf(bVarArr, Math.max(0, bVarArr.length)));
        n6b.H(1);
        n6b.H(2);
        n6b.H(3);
        n6b.H(4);
    }

    public sa(a[] aVarArr) {
        this.a = aVarArr.length;
        this.b = aVarArr;
    }

    public final a a(int i) {
        return i < 0 ? d : this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sa.class != obj.getClass()) {
            return false;
        }
        sa saVar = (sa) obj;
        return this.a == saVar.a && Arrays.equals(this.b, saVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((this.a * 29791) + 1) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            a[] aVarArr = this.b;
            if (i >= aVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            aVarArr[i].getClass();
            for (int i2 = 0; i2 < aVarArr[i].e.length; i2++) {
                sb.append("ad(state=");
                int i3 = aVarArr[i].e[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(aVarArr[i].f[i2]);
                sb.append(')');
                if (i2 < aVarArr[i].e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < aVarArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
