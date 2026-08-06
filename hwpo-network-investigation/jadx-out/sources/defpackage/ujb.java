package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ujb {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final String[] a;

        public a(String[] strArr) {
            this.a = strArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final byte[] g;

        public c(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = bArr;
        }
    }

    public static su6 a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String str2 = n6b.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                md6.g("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zy7.d(new pt7(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    md6.h("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new sjb(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new su6(arrayList);
    }

    public static a b(pt7 pt7Var, boolean z, boolean z2) throws ut7 {
        if (z) {
            c(3, pt7Var, false);
        }
        pt7Var.x((int) pt7Var.q(), StandardCharsets.UTF_8);
        long jQ = pt7Var.q();
        String[] strArr = new String[(int) jQ];
        for (int i = 0; i < jQ; i++) {
            strArr[i] = pt7Var.x((int) pt7Var.q(), StandardCharsets.UTF_8);
        }
        if (z2 && (pt7Var.z() & 1) == 0) {
            throw ut7.a(null, "framing bit expected to be set");
        }
        return new a(strArr);
    }

    public static boolean c(int i, pt7 pt7Var, boolean z) {
        if (pt7Var.a() < 7) {
            if (z) {
                return false;
            }
            throw ut7.a(null, "too short header: " + pt7Var.a());
        }
        if (pt7Var.z() != i) {
            if (z) {
                return false;
            }
            throw ut7.a(null, "expected header type " + Integer.toHexString(i));
        }
        if (pt7Var.z() == 118 && pt7Var.z() == 111 && pt7Var.z() == 114 && pt7Var.z() == 98 && pt7Var.z() == 105 && pt7Var.z() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ut7.a(null, "expected characters 'vorbis'");
    }
}
