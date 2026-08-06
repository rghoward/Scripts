package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l96 {
    public static final void a(int i, int i2) {
        if (i < 0 || i >= i2) {
            r.b(u.a(i, i2, "index: ", ", size: "));
        }
    }

    public static final void b(int i, int i2) {
        if (i < 0 || i > i2) {
            r.b(u.a(i, i2, "index: ", ", size: "));
        }
    }

    public static final void c(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            cp2.a(i3, u43.b("fromIndex: ", ", toIndex: ", ", size: ", i, i2));
        } else {
            if (i <= i2) {
                return;
            }
            z90.a(u.a(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static String d(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        String str = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = ((isa) obj).a.g.o;
            if (fv6.m(str2)) {
                return "video/mp4";
            }
            if (fv6.i(str2)) {
                z = true;
            } else if (fv6.k(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }
}
