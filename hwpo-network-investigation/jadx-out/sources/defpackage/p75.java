package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.PostProcessor;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p75 implements jn2 {
    public final m85 a;
    public final zk7 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements jn2.a {
        @Override // jn2.a
        public final jn2 create(tw9 tw9Var, zk7 zk7Var, b85 b85Var) {
            hy0 hy0VarP = tw9Var.a.p();
            if (!hy0VarP.q(0L, tl4.b) && !hy0VarP.q(0L, tl4.a) && (!hy0VarP.q(0L, tl4.c) || !hy0VarP.q(8L, tl4.d) || !hy0VarP.q(12L, tl4.e) || !hy0VarP.request(17L) || ((byte) (hy0VarP.j().u(16L) & 2)) <= 0)) {
                if (Build.VERSION.SDK_INT < 30 || !hy0VarP.q(4L, tl4.f)) {
                    return null;
                }
                if (!hy0VarP.q(8L, tl4.g) && !hy0VarP.q(8L, tl4.h) && !hy0VarP.q(8L, tl4.i)) {
                    return null;
                }
            }
            return new p75(tw9Var.a, zk7Var);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return a.class.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", l = {50, 90}, m = "decode")
    public static final class b extends u02 {
        public Object t;
        public cl8 u;
        public /* synthetic */ Object v;
        public int x;

        public b(u02 u02Var) {
            super(u02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return p75.this.decode(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements ImageDecoder$OnHeaderDecodedListener {
        public final /* synthetic */ gl8 a;
        public final /* synthetic */ p75 b;
        public final /* synthetic */ cl8 c;

        public c(gl8 gl8Var, p75 p75Var, cl8 cl8Var) {
            this.a = gl8Var;
            this.b = p75Var;
            this.c = cl8Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            this.a.t = imageDecoder;
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            p75 p75Var = this.b;
            zk7 zk7Var = p75Var.b;
            br9 br9Var = zk7Var.d;
            s39 s39Var = zk7Var.e;
            br9 br9Var2 = br9.c;
            int iB = xj5.a(br9Var, br9Var2) ? width : j.b(br9Var.a, s39Var);
            zk7 zk7Var2 = p75Var.b;
            br9 br9Var3 = zk7Var2.d;
            int iB2 = xj5.a(br9Var3, br9Var2) ? height : j.b(br9Var3.b, zk7Var2.e);
            if (width > 0 && height > 0 && (width != iB || height != iB2)) {
                double dG = eo7.g(width, height, iB, iB2, p75Var.b.e);
                boolean z = dG < 1.0d;
                this.c.t = z;
                if (z || !p75Var.b.f) {
                    imageDecoder.setTargetSize(wk6.a(((double) width) * dG), wk6.a(dG * ((double) height)));
                }
            }
            zk7 zk7Var3 = p75Var.b;
            imageDecoder.setAllocator(j.a(zk7Var3.b) ? 3 : 1);
            imageDecoder.setMemorySizePolicy(!zk7Var3.g ? 1 : 0);
            ColorSpace colorSpace = zk7Var3.c;
            if (colorSpace != null) {
                imageDecoder.setTargetColorSpace(colorSpace);
            }
            imageDecoder.setUnpremultipliedRequired(!zk7Var3.h);
            final xu xuVar = (xu) zk7Var3.l.d("coil#animated_transformation");
            imageDecoder.setPostProcessor(xuVar != null ? new PostProcessor() { // from class: g
                @Override // android.graphics.PostProcessor
                public final int onPostProcess(Canvas canvas) {
                    int iOrdinal = xuVar.transform(canvas).ordinal();
                    if (iOrdinal == 0) {
                        return 0;
                    }
                    if (iOrdinal == 1) {
                        return -3;
                    }
                    if (iOrdinal == 2) {
                        return -1;
                    }
                    u.b();
                    return 0;
                }
            } : null);
        }
    }

    public p75(m85 m85Var, zk7 zk7Var) {
        this.a = m85Var;
        this.b = zk7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable a(p75 p75Var, cl8 cl8Var) throws IOException {
        gl8 gl8Var = new gl8();
        m85 nw9Var = p75Var.a;
        hy0 hy0VarP = nw9Var.p();
        if (hy0VarP.q(0L, tl4.b) || hy0VarP.q(0L, tl4.a)) {
            nw9Var = new nw9(new ni8(new ch4(nw9Var.p())), new ld2(2, p75Var.b.a), null);
        }
        try {
            return ImageDecoder.decodeDrawable(p75Var.b(nw9Var), new c(gl8Var, p75Var, cl8Var));
        } finally {
            ImageDecoder imageDecoder = (ImageDecoder) gl8Var.t;
            if (imageDecoder != null) {
                imageDecoder.close();
            }
            nw9Var.close();
        }
    }

    public final ImageDecoder.Source b(m85 m85Var) {
        du7 du7VarK = m85Var.k();
        if (du7VarK != null) {
            return ImageDecoder.createSource(du7VarK.toFile());
        }
        m85.a aVarM = m85Var.m();
        boolean z = aVarM instanceof r40;
        zk7 zk7Var = this.b;
        if (z) {
            return ImageDecoder.createSource(zk7Var.a.getAssets(), ((r40) aVarM).a);
        }
        if (aVarM instanceof jz1) {
            return ImageDecoder.createSource(zk7Var.a.getContentResolver(), ((jz1) aVarM).a);
        }
        if (aVarM instanceof au8) {
            au8 au8Var = (au8) aVarM;
            if (xj5.a(au8Var.a, zk7Var.a.getPackageName())) {
                return ImageDecoder.createSource(zk7Var.a.getResources(), au8Var.b);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return ImageDecoder.createSource(m85Var.p().x());
        }
        return i == 30 ? ImageDecoder.createSource(ByteBuffer.wrap(m85Var.p().x())) : ImageDecoder.createSource(m85Var.h().toFile());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Drawable drawable, u02 u02Var) throws Throwable {
        q75 q75Var;
        if (u02Var instanceof q75) {
            q75Var = (q75) u02Var;
            int i = q75Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                q75Var.x = i - Integer.MIN_VALUE;
            } else {
                q75Var = new q75(this, u02Var);
            }
        } else {
            q75Var = new q75(this, u02Var);
        }
        Object obj = q75Var.v;
        int i2 = q75Var.x;
        if (i2 == 0) {
            dv8.b(obj);
            if (!(drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawable;
            zk7 zk7Var = this.b;
            ys7 ys7Var = zk7Var.l;
            ys7 ys7Var2 = zk7Var.l;
            Integer num = (Integer) ys7Var.d("coil#repeat_count");
            animatedImageDrawable.setRepeatCount(num != null ? num.intValue() : -1);
            mh4 mh4Var = (mh4) ys7Var2.d("coil#animation_start_callback");
            mh4 mh4Var2 = (mh4) ys7Var2.d("coil#animation_end_callback");
            if (mh4Var != null || mh4Var2 != null) {
                et2 et2Var = i23.a;
                gt4 gt4VarX0 = ag6.a.x0();
                s75 s75Var = new s75(drawable, mh4Var, mh4Var2, null);
                q75Var.t = this;
                q75Var.u = drawable;
                q75Var.x = 1;
                Object objG = oy0.g(gt4VarX0, s75Var, q75Var);
                v72 v72Var = v72.t;
                if (objG == v72Var) {
                    return v72Var;
                }
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            drawable = (Drawable) q75Var.u;
            this = q75Var.t;
            dv8.b(obj);
        }
        return new u39(drawable, this.b.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.jn2
    public final Object decode(r02<? super in2> r02Var) throws Throwable {
        b bVar;
        final cl8 cl8Var;
        Object objG;
        cl8 cl8Var2;
        if (r02Var instanceof b) {
            bVar = (b) r02Var;
            int i = bVar.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.x = i - Integer.MIN_VALUE;
            } else {
                bVar = new b((u02) r02Var);
            }
        } else {
            bVar = new b((u02) r02Var);
        }
        Object obj = bVar.v;
        int i2 = bVar.x;
        v72 v72Var = v72.t;
        if (i2 == 0) {
            dv8.b(obj);
            cl8Var = new cl8();
            mh4 mh4Var = new mh4() { // from class: o75
                @Override // defpackage.mh4
                public final Object invoke() {
                    return p75.a(this.t, cl8Var);
                }
            };
            bVar.t = this;
            bVar.u = cl8Var;
            bVar.x = 1;
            objG = zv.g(mh4Var, bVar);
            if (objG != v72Var) {
            }
            return v72Var;
        }
        if (i2 == 1) {
            cl8 cl8Var3 = bVar.u;
            p75 p75Var = (p75) bVar.t;
            dv8.b(obj);
            cl8Var = cl8Var3;
            this = p75Var;
            objG = obj;
        } else {
            if (i2 != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cl8Var2 = (cl8) bVar.t;
            dv8.b(obj);
        }
        return new in2((Drawable) obj, cl8Var2.t);
        bVar.t = cl8Var;
        bVar.u = null;
        bVar.x = 2;
        Object objC = this.c((Drawable) objG, bVar);
        if (objC != v72Var) {
            cl8 cl8Var4 = cl8Var;
            obj = objC;
            cl8Var2 = cl8Var4;
            return new in2((Drawable) obj, cl8Var2.t);
        }
        return v72Var;
    }
}
