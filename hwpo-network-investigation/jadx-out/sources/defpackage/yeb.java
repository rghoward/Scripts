package defpackage;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yeb implements jn2 {
    public final m85 a;
    public final zk7 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements jn2.a {
        @Override // jn2.a
        public final jn2 create(tw9 tw9Var, zk7 zk7Var, b85 b85Var) {
            String str = tw9Var.b;
            if (str == null || !w2a.n(str, "video/", false)) {
                return null;
            }
            return new yeb(tw9Var.a, zk7Var);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return a.class.hashCode();
        }
    }

    public yeb(m85 m85Var, zk7 zk7Var) {
        this.a = m85Var;
        this.b = zk7Var;
    }

    public final long a(MediaMetadataRetriever mediaMetadataRetriever) {
        Long lG;
        zk7 zk7Var = this.b;
        Long l = (Long) zk7Var.l.d("coil#video_frame_micros");
        if (l != null) {
            return l.longValue();
        }
        Double d = (Double) zk7Var.l.d("coil#video_frame_percent");
        long jLongValue = 0;
        if (d == null) {
            return 0L;
        }
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (strExtractMetadata != null && (lG = v2a.g(strExtractMetadata)) != null) {
            jLongValue = lG.longValue();
        }
        return wk6.c(d.doubleValue() * jLongValue) * 1000;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (defpackage.eo7.g(r3, r4, r5, r6, r8.e) == 1.0d) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(android.graphics.Bitmap r9, defpackage.br9 r10) {
        /*
            r8 = this;
            s03 r0 = r10.b
            s03 r10 = r10.a
            int r1 = android.os.Build.VERSION.SDK_INT
            zk7 r8 = r8.b
            r2 = 26
            if (r1 < r2) goto L1a
            android.graphics.Bitmap$Config r3 = r9.getConfig()
            android.graphics.Bitmap$Config r4 = defpackage.ro.a()
            if (r3 != r4) goto L1a
            android.graphics.Bitmap$Config r3 = r8.b
            if (r3 != r4) goto L50
        L1a:
            boolean r3 = r8.f
            if (r3 == 0) goto L1f
            goto L4f
        L1f:
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            boolean r5 = r10 instanceof s03.a
            if (r5 == 0) goto L31
            r5 = r10
            s03$a r5 = (s03.a) r5
            int r5 = r5.a
            goto L35
        L31:
            int r5 = r9.getWidth()
        L35:
            boolean r6 = r0 instanceof s03.a
            if (r6 == 0) goto L3f
            r6 = r0
            s03$a r6 = (s03.a) r6
            int r6 = r6.a
            goto L43
        L3f:
            int r6 = r9.getHeight()
        L43:
            s39 r7 = r8.e
            double r3 = defpackage.eo7.g(r3, r4, r5, r6, r7)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L50
        L4f:
            return r9
        L50:
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            boolean r5 = r10 instanceof s03.a
            if (r5 == 0) goto L61
            s03$a r10 = (s03.a) r10
            int r10 = r10.a
            goto L65
        L61:
            int r10 = r9.getWidth()
        L65:
            boolean r5 = r0 instanceof s03.a
            if (r5 == 0) goto L6e
            s03$a r0 = (s03.a) r0
            int r0 = r0.a
            goto L72
        L6e:
            int r0 = r9.getHeight()
        L72:
            s39 r5 = r8.e
            android.graphics.Bitmap$Config r8 = r8.b
            double r3 = defpackage.eo7.g(r3, r4, r10, r0, r5)
            float r10 = (float) r3
            int r0 = r9.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r10
            int r0 = defpackage.wk6.b(r0)
            int r3 = r9.getHeight()
            float r3 = (float) r3
            float r3 = r3 * r10
            int r3 = defpackage.wk6.b(r3)
            if (r1 < r2) goto L99
            android.graphics.Bitmap$Config r1 = defpackage.ro.a()
            if (r8 != r1) goto L99
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
        L99:
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 3
            r1.<init>(r2)
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r0, r3, r8)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r8)
            r0.scale(r10, r10)
            r10 = 0
            r0.drawBitmap(r9, r10, r10, r1)
            r9.recycle()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yeb.b(android.graphics.Bitmap, br9):android.graphics.Bitmap");
    }

    public final void c(MediaMetadataRetriever mediaMetadataRetriever, m85 m85Var) throws IOException {
        if (m85Var.m() instanceof rn6) {
            m85.a aVarM = m85Var.m();
            aVarM.getClass();
            mediaMetadataRetriever.setDataSource((MediaDataSource) null);
            return;
        }
        m85.a aVarM2 = m85Var.m();
        boolean z = aVarM2 instanceof r40;
        zk7 zk7Var = this.b;
        if (z) {
            AssetFileDescriptor assetFileDescriptorOpenFd = zk7Var.a.getAssets().openFd(((r40) aVarM2).a);
            try {
                mediaMetadataRetriever.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                g2b g2bVar = g2b.a;
                assetFileDescriptorOpenFd.close();
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fg1.a(assetFileDescriptorOpenFd, th);
                    throw th2;
                }
            }
        }
        if (aVarM2 instanceof jz1) {
            mediaMetadataRetriever.setDataSource(zk7Var.a, ((jz1) aVarM2).a);
            return;
        }
        if (!(aVarM2 instanceof au8)) {
            mediaMetadataRetriever.setDataSource(m85Var.h().toFile().getPath());
            return;
        }
        StringBuilder sb = new StringBuilder("android.resource://");
        au8 au8Var = (au8) aVarM2;
        sb.append(au8Var.a);
        sb.append('/');
        sb.append(au8Var.b);
        mediaMetadataRetriever.setDataSource(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[PHI: r10
      0x0072: PHI (r10v9 int) = (r10v6 int), (r10v6 int), (r10v20 int), (r10v20 int) binds: [B:39:0x008c, B:41:0x0092, B:26:0x0065, B:28:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jn2
    public final Object decode(r02<? super in2> r02Var) throws Exception {
        boolean zIsTerminated;
        int iIntValue;
        Integer numF;
        int iIntValue2;
        Integer numF2;
        double d;
        br9 br9Var;
        s39 s39Var;
        long j;
        Bitmap bitmapA;
        boolean zIsTerminated2;
        int iC;
        Integer numF3;
        Integer numF4;
        Integer numF5;
        TimeUnit timeUnit = TimeUnit.DAYS;
        zk7 zk7Var = this.b;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            c(mediaMetadataRetriever, this.a);
            ys7 ys7Var = zk7Var.l;
            br9 br9Var2 = zk7Var.d;
            s39 s39Var2 = zk7Var.e;
            Integer num = (Integer) ys7Var.d("coil#video_frame_option");
            int iIntValue3 = num != null ? num.intValue() : 2;
            long jA = a(mediaMetadataRetriever);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
            int iIntValue4 = (strExtractMetadata == null || (numF5 = v2a.f(strExtractMetadata)) == null) ? 0 : numF5.intValue();
            if (iIntValue4 == 90 || iIntValue4 == 270) {
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                iIntValue = (strExtractMetadata2 == null || (numF2 = v2a.f(strExtractMetadata2)) == null) ? 0 : numF2.intValue();
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(18);
                if (strExtractMetadata3 == null || (numF = v2a.f(strExtractMetadata3)) == null) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = numF.intValue();
                }
            } else {
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(18);
                iIntValue = (strExtractMetadata4 == null || (numF4 = v2a.f(strExtractMetadata4)) == null) ? 0 : numF4.intValue();
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(19);
                if (strExtractMetadata5 == null || (numF3 = v2a.f(strExtractMetadata5)) == null) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = numF3.intValue();
                }
            }
            int height = iIntValue2;
            int width = iIntValue;
            if (width <= 0 || height <= 0) {
                d = 1.0d;
                br9Var = br9.c;
            } else {
                br9 br9Var3 = br9.c;
                if (xj5.a(br9Var2, br9Var3)) {
                    iC = width;
                    d = 1.0d;
                } else {
                    d = 1.0d;
                    iC = w.c(br9Var2.a, s39Var2);
                }
                double dG = eo7.g(width, height, iC, xj5.a(br9Var2, br9Var3) ? height : w.c(br9Var2.b, s39Var2), s39Var2);
                if (zk7Var.f && dG > d) {
                    dG = d;
                }
                double d2 = dG;
                br9Var = new br9(new s03.a(wk6.a(((double) width) * d2)), new s03.a(wk6.a(d2 * ((double) height))));
            }
            s03 s03Var = br9Var.a;
            s03 s03Var2 = br9Var.b;
            int i = Build.VERSION.SDK_INT;
            if (i >= 27 && (s03Var instanceof s03.a) && (s03Var2 instanceof s03.a)) {
                int i2 = iIntValue3;
                j = jA;
                s39Var = s39Var2;
                bitmapA = w.b(mediaMetadataRetriever, j, i2, ((s03.a) s03Var).a, ((s03.a) s03Var2).a, zk7Var.b);
            } else {
                s39Var = s39Var2;
                int i3 = iIntValue3;
                j = jA;
                bitmapA = w.a(mediaMetadataRetriever, j, i3, zk7Var.b);
                if (bitmapA != null) {
                    width = bitmapA.getWidth();
                    height = bitmapA.getHeight();
                } else {
                    bitmapA = null;
                }
            }
            if (bitmapA == null) {
                throw new IllegalStateException(("Failed to decode frame at " + j + " microseconds.").toString());
            }
            Bitmap bitmapB = b(bitmapA, br9Var);
            in2 in2Var = new in2(new BitmapDrawable(zk7Var.a.getResources(), bitmapB), width <= 0 || height <= 0 || eo7.g(width, height, bitmapB.getWidth(), bitmapB.getHeight(), s39Var) < d);
            if (i < 29) {
                mediaMetadataRetriever.release();
                return in2Var;
            }
            if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
                return in2Var;
            }
            if (!(mediaMetadataRetriever instanceof ExecutorService)) {
                mediaMetadataRetriever.release();
                return in2Var;
            }
            ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
            if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z = false;
                while (!zIsTerminated2) {
                    try {
                        zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            return in2Var;
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService2 = (ExecutorService) mediaMetadataRetriever;
                if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    boolean z2 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z2) {
                                executorService2.shutdownNow();
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            throw th;
        }
    }
}
