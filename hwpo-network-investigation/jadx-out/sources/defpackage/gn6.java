package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gn6 {
    public static Boolean a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:20:0x003f  */
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            boolean z;
            int i3;
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
                int i4 = 0;
                while (true) {
                    z = true;
                    if (i4 >= supportedPerformancePoints.size()) {
                        i3 = 1;
                        break;
                    }
                    if (fn6.a(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                        i3 = 2;
                        break;
                    }
                    i4++;
                }
                if (i3 == 1 && gn6.a == null) {
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 37) {
                        z = false;
                    } else {
                        int iB = b(true);
                        if (i5 < 35 ? !(b(false) != 2 || iB == 1) : iB != 1) {
                            z = false;
                        }
                    }
                    gn6.a = Boolean.valueOf(z);
                    if (z) {
                    }
                }
                return i3;
            }
            return 0;
        }

        public static int b(boolean z) {
            MediaCodecInfo.VideoCapabilities videoCapabilities;
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
            try {
                id4.a aVar = new id4.a();
                aVar.n = fv6.n("video/avc");
                id4 id4Var = new id4(aVar);
                String str = id4Var.o;
                if (str != null) {
                    List listE = mn6.e(z, str, false);
                    String strC = mn6.c(id4Var);
                    Iterable iterableE = strC == null ? ul8.x : mn6.e(z, strC, false);
                    k95.a aVar2 = new k95.a();
                    aVar2.d(listE);
                    aVar2.d(iterableE);
                    ul8 ul8VarG = aVar2.g();
                    for (int i = 0; i < ul8VarG.w; i++) {
                        if (((en6) ul8VarG.get(i)).d != null && (videoCapabilities = ((en6) ul8VarG.get(i)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                            for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                                if (fn6.a(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                    return 2;
                                }
                            }
                            return 1;
                        }
                    }
                }
            } catch (mn6.b unused) {
            }
            return 0;
        }
    }
}
