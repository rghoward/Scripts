package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import java.util.Set;
import ni8.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jq0 implements jn2 {
    public final m85 a;
    public final zk7 b;
    public final lc9 c;
    public final fo3 d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends td4 {
        public Exception u;

        @Override // defpackage.td4, defpackage.kw9
        public final long O(tx0 tx0Var, long j) throws Exception {
            try {
                return super.O(tx0Var, j);
            } catch (Exception e) {
                this.u = e;
                throw e;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements jn2.a {
        public final fo3 a;
        public final oc9 b;

        public b(int i, fo3 fo3Var) {
            this.a = fo3Var;
            int i2 = pc9.a;
            this.b = new oc9(i);
        }

        @Override // jn2.a
        public final jn2 create(tw9 tw9Var, zk7 zk7Var, b85 b85Var) {
            return new jq0(tw9Var.a, zk7Var, this.b, this.a);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return b.class.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {231, 46}, m = "decode")
    public static final class c extends u02 {
        public Object t;
        public lc9 u;
        public /* synthetic */ Object v;
        public int x;

        public c(u02 u02Var) {
            super(u02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return jq0.this.decode(this);
        }
    }

    public jq0(m85 m85Var, zk7 zk7Var, oc9 oc9Var, fo3 fo3Var) {
        this.a = m85Var;
        this.b = zk7Var;
        this.c = oc9Var;
        this.d = fo3Var;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x01ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:132:0x0214  */
    /* JADX WARN: Code duplicated, block: B:134:0x021d  */
    /* JADX WARN: Code duplicated, block: B:137:0x023a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0243  */
    /* JADX WARN: Code duplicated, block: B:142:0x024d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0267  */
    /* JADX WARN: Code duplicated, block: B:151:0x0275  */
    /* JADX WARN: Code duplicated, block: B:160:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:163:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    public static in2 a(jq0 jq0Var) throws Exception {
        bo3 bo3Var;
        boolean z;
        int i;
        int iMin;
        double dMax;
        Bitmap bitmapDecodeStream;
        Exception exc;
        Matrix matrix;
        float width;
        float height;
        RectF rectF;
        float f;
        Bitmap.Config config;
        Bitmap bitmapCreateBitmap;
        boolean z2;
        ColorSpace colorSpace;
        int i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        zk7 zk7Var = jq0Var.b;
        m85 m85Var = jq0Var.a;
        a aVar = new a(m85Var.p());
        ni8 ni8Var = new ni8(aVar);
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(ni8Var.k().new a(), null, options);
        Exception exc2 = aVar.u;
        if (exc2 != null) {
            throw exc2;
        }
        options.inJustDecodeBounds = false;
        Paint paint = ho3.a;
        String str = options.outMimeType;
        fo3 fo3Var = jq0Var.d;
        Set<String> set = io3.a;
        int iOrdinal = fo3Var.ordinal();
        if (iOrdinal == 0) {
            bo3Var = bo3.c;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    u.b();
                    return null;
                }
            } else if (str == null || !io3.a.contains(str)) {
                bo3Var = bo3.c;
            }
            co3 co3Var = new co3(new eo3(ni8Var.k().new a()));
            int iC = co3Var.c(1, "Orientation");
            boolean z3 = iC == 2 || iC == 7 || iC == 4 || iC == 5;
            switch (co3Var.c(1, "Orientation")) {
                case 3:
                case 4:
                    i2 = 180;
                    break;
                case 5:
                case 8:
                    i2 = 270;
                    break;
                case 6:
                case 7:
                    i2 = 90;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            bo3Var = new bo3(i2, z3);
        }
        int i3 = bo3Var.b;
        boolean z4 = bo3Var.a;
        Exception exc3 = aVar.u;
        if (exc3 != null) {
            throw exc3;
        }
        options.inMutable = false;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && (colorSpace = zk7Var.c) != null) {
            options.inPreferredColorSpace = colorSpace;
        }
        boolean z5 = zk7Var.h;
        Context context = zk7Var.a;
        br9 br9Var = zk7Var.d;
        options.inPremultiplied = z5;
        Bitmap.Config config2 = zk7Var.b;
        if ((z4 || i3 > 0) && (config2 == null || defpackage.b.b(config2))) {
            config2 = Bitmap.Config.ARGB_8888;
        }
        if (zk7Var.g && config2 == Bitmap.Config.ARGB_8888 && xj5.a(options.outMimeType, "image/jpeg")) {
            config2 = Bitmap.Config.RGB_565;
        }
        if (i4 >= 26) {
            Bitmap.Config config3 = options.outConfig;
            Bitmap.Config config4 = Bitmap.Config.RGBA_F16;
            if (config3 == config4 && config2 != Bitmap.Config.HARDWARE) {
                config2 = config4;
            }
        }
        options.inPreferredConfig = config2;
        m85.a aVarM = m85Var.m();
        try {
            if ((aVarM instanceof au8) && xj5.a(br9Var, br9.c)) {
                options.inSampleSize = 1;
                options.inScaled = true;
                options.inDensity = ((au8) aVarM).c;
                options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                context = context;
            } else {
                int i5 = options.outWidth;
                if (i5 <= 0 || (i = options.outHeight) <= 0) {
                    options.inSampleSize = 1;
                    z = false;
                    options.inScaled = false;
                    bitmapDecodeStream = BitmapFactory.decodeStream(ni8Var.new a(), null, options);
                    ni8Var.close();
                    exc = aVar.u;
                    if (exc == null) {
                        throw exc;
                    }
                    if (bitmapDecodeStream != null) {
                        aa0.c("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z4 || i3 > 0) {
                        matrix = new Matrix();
                        width = bitmapDecodeStream.getWidth() / 2.0f;
                        height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z4) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i3 > 0) {
                            matrix.postRotate(i3, width, height);
                        }
                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        f = rectF.left;
                        if (f == 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        if (i3 != 90 || i3 == 270) {
                            int height2 = bitmapDecodeStream.getHeight();
                            int width2 = bitmapDecodeStream.getWidth();
                            config = bitmapDecodeStream.getConfig();
                            if (config == null) {
                                config = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config);
                        } else {
                            int width3 = bitmapDecodeStream.getWidth();
                            int height3 = bitmapDecodeStream.getHeight();
                            Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, ho3.a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                    if (options.inSampleSize <= 1 || options.inScaled) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    return new in2(bitmapDrawable, z2);
                }
                int i6 = (i3 == 90 || i3 == 270) ? i : i5;
                if (i3 != 90 && i3 != 270) {
                    i5 = i;
                }
                s39 s39Var = zk7Var.e;
                br9 br9Var2 = br9.c;
                int iE = xj5.a(br9Var, br9Var2) ? i6 : v.e(br9Var.a, s39Var);
                int iE2 = xj5.a(br9Var, br9Var2) ? i5 : v.e(br9Var.b, s39Var);
                int iHighestOneBit = Integer.highestOneBit(i6 / iE);
                int iHighestOneBit2 = Integer.highestOneBit(i5 / iE2);
                int iOrdinal2 = s39Var.ordinal();
                if (iOrdinal2 == 0) {
                    iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                } else {
                    if (iOrdinal2 != 1) {
                        u.b();
                        return null;
                    }
                    iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                }
                if (iMin < 1) {
                    iMin = 1;
                }
                options.inSampleSize = iMin;
                double d = iMin;
                context = context;
                double d2 = ((double) iE) / (((double) i6) / d);
                double d3 = ((double) iE2) / (((double) i5) / d);
                int iOrdinal3 = s39Var.ordinal();
                if (iOrdinal3 == 0) {
                    dMax = Math.max(d2, d3);
                } else {
                    if (iOrdinal3 != 1) {
                        u.b();
                        return null;
                    }
                    dMax = Math.min(d2, d3);
                }
                if (zk7Var.f && dMax > 1.0d) {
                    dMax = 1.0d;
                }
                boolean z6 = dMax == 1.0d;
                options.inScaled = !z6;
                if (!z6) {
                    if (dMax > 1.0d) {
                        options.inDensity = wk6.a(2.147483647E9d / dMax);
                        options.inTargetDensity = Integer.MAX_VALUE;
                    } else {
                        options.inDensity = Integer.MAX_VALUE;
                        options.inTargetDensity = wk6.a(2.147483647E9d * dMax);
                    }
                }
            }
            bitmapDecodeStream = BitmapFactory.decodeStream(ni8Var.new a(), null, options);
            ni8Var.close();
            exc = aVar.u;
            if (exc == null) {
                throw exc;
            }
            if (bitmapDecodeStream != null) {
                aa0.c("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                return null;
            }
            bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            if (z4) {
                matrix = new Matrix();
                width = bitmapDecodeStream.getWidth() / 2.0f;
                height = bitmapDecodeStream.getHeight() / 2.0f;
                if (z4) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i3 > 0) {
                    matrix.postRotate(i3, width, height);
                }
                rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                matrix.mapRect(rectF);
                f = rectF.left;
                if (f == 0.0f) {
                    matrix.postTranslate(-f, -rectF.top);
                } else {
                    matrix.postTranslate(-f, -rectF.top);
                }
                if (i3 != 90) {
                    int height4 = bitmapDecodeStream.getHeight();
                    int width4 = bitmapDecodeStream.getWidth();
                    config = bitmapDecodeStream.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height4, width4, config);
                } else {
                    int height5 = bitmapDecodeStream.getHeight();
                    int width5 = bitmapDecodeStream.getWidth();
                    config = bitmapDecodeStream.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height5, width5, config);
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, ho3.a);
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = bitmapCreateBitmap;
            } else {
                matrix = new Matrix();
                width = bitmapDecodeStream.getWidth() / 2.0f;
                height = bitmapDecodeStream.getHeight() / 2.0f;
                if (z4) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i3 > 0) {
                    matrix.postRotate(i3, width, height);
                }
                rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                matrix.mapRect(rectF);
                f = rectF.left;
                if (f == 0.0f) {
                    matrix.postTranslate(-f, -rectF.top);
                } else {
                    matrix.postTranslate(-f, -rectF.top);
                }
                if (i3 != 90) {
                    int height6 = bitmapDecodeStream.getHeight();
                    int width6 = bitmapDecodeStream.getWidth();
                    config = bitmapDecodeStream.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height6, width6, config);
                } else {
                    int height7 = bitmapDecodeStream.getHeight();
                    int width7 = bitmapDecodeStream.getWidth();
                    config = bitmapDecodeStream.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height7, width7, config);
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, ho3.a);
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = bitmapCreateBitmap;
            }
            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
            if (options.inSampleSize <= 1) {
                z2 = true;
            } else {
                z2 = true;
            }
            return new in2(bitmapDrawable2, z2);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fg1.a(ni8Var, th);
                throw th2;
            }
        }
        z = false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.jn2
    public final Object decode(r02<? super in2> r02Var) throws Throwable {
        c cVar;
        lc9 lc9Var;
        Throwable th;
        lc9 lc9Var2;
        if (r02Var instanceof c) {
            cVar = (c) r02Var;
            int i = cVar.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.x = i - Integer.MIN_VALUE;
            } else {
                cVar = new c((u02) r02Var);
            }
        } else {
            cVar = new c((u02) r02Var);
        }
        Object obj = cVar.v;
        int i2 = cVar.x;
        v72 v72Var = v72.t;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                cVar.t = this;
                lc9Var = this.c;
                cVar.u = lc9Var;
                cVar.x = 1;
                if (lc9Var.d(cVar) != v72Var) {
                }
                return v72Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lc9Var2 = (lc9) cVar.t;
                try {
                    dv8.b(obj);
                    in2 in2Var = (in2) obj;
                    lc9Var2.a();
                    return in2Var;
                } catch (Throwable th2) {
                    th = th2;
                    lc9Var2.a();
                    throw th;
                }
            }
            lc9 lc9Var3 = cVar.u;
            jq0 jq0Var = (jq0) cVar.t;
            dv8.b(obj);
            lc9Var = lc9Var3;
            this = jq0Var;
            mh4 mh4Var = new mh4() { // from class: iq0
                @Override // defpackage.mh4
                public final Object invoke() {
                    return jq0.a(this.t);
                }
            };
            cVar.t = lc9Var;
            cVar.u = null;
            cVar.x = 2;
            Object objG = zv.g(mh4Var, cVar);
            if (objG != v72Var) {
                lc9 lc9Var4 = lc9Var;
                obj = objG;
                lc9Var2 = lc9Var4;
                in2 in2Var2 = (in2) obj;
                lc9Var2.a();
                return in2Var2;
            }
            return v72Var;
        } catch (Throwable th3) {
            lc9 lc9Var5 = lc9Var;
            th = th3;
            lc9Var2 = lc9Var5;
            lc9Var2.a();
            throw th;
        }
    }
}
