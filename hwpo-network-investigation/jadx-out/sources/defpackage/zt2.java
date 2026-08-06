package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zt2 implements z4a.a {
    @Override // z4a.a
    public final boolean f(id4 id4Var) {
        String str = id4Var.o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // z4a.a
    public final z4a g(id4 id4Var) {
        String str = id4Var.o;
        List<byte[]> list = id4Var.r;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new r93(list);
                case "application/pgs":
                    return new rx7();
                case "application/x-mp4-vtt":
                    return new yz6();
                case "text/vtt":
                    return new mlb();
                case "application/x-quicktime-tx3g":
                    return new eza(list);
                case "text/x-ssa":
                    return new vy9(list);
                case "application/vobsub":
                    return new pjb(list);
                case "application/x-subrip":
                    return new i4a();
                case "application/ttml+xml":
                    return new rya();
            }
        }
        z90.a(ct1.a("Unsupported MIME type: ", str));
        return null;
    }

    @Override // z4a.a
    public final int h(id4 id4Var) {
        String str = id4Var.o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        z90.a(ct1.a("Unsupported MIME type: ", str));
        return 0;
    }
}
