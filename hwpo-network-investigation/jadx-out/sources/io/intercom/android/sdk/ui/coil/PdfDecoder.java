package io.intercom.android.sdk.ui.coil;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import defpackage.aa0;
import defpackage.b85;
import defpackage.br9;
import defpackage.cl8;
import defpackage.dv8;
import defpackage.eo7;
import defpackage.in2;
import defpackage.jn2;
import defpackage.m85;
import defpackage.mh4;
import defpackage.r02;
import defpackage.s39;
import defpackage.tw9;
import defpackage.u02;
import defpackage.v72;
import defpackage.wk6;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.zk7;
import defpackage.zv;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.coil.PdfDecoder;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdfDecoder implements jn2 {
    public static final int $stable = 8;
    private final zk7 options;
    private final m85 source;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Factory implements jn2.a {
        public static final int $stable = 0;

        private final boolean isApplicable(String str) {
            if (str != null) {
                return ContentTypeExtensionKt.isPdf(str);
            }
            return false;
        }

        @Override // jn2.a
        public jn2 create(tw9 tw9Var, zk7 zk7Var, b85 b85Var) {
            tw9Var.getClass();
            zk7Var.getClass();
            b85Var.getClass();
            if (isApplicable(tw9Var.b)) {
                return new PdfDecoder(tw9Var.a, zk7Var);
            }
            return null;
        }

        public boolean equals(Object obj) {
            return obj instanceof Factory;
        }

        public int hashCode() {
            return Factory.class.hashCode();
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.coil.PdfDecoder$decode$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.ui.coil.PdfDecoder", f = "PdfDecoder.kt", l = {34}, m = "decode")
    public static final class AnonymousClass1 extends u02 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PdfDecoder.this.decode(this);
        }
    }

    public PdfDecoder(m85 m85Var, zk7 zk7Var) {
        m85Var.getClass();
        zk7Var.getClass();
        this.source = m85Var;
        this.options = zk7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BitmapDrawable decode$lambda$5(PdfDecoder pdfDecoder, cl8 cl8Var) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(pdfDecoder.source.h().toFile(), 268435456);
                try {
                    PdfRenderer.Page pageOpenPage = new PdfRenderer(parcelFileDescriptorOpen).openPage(0);
                    pageOpenPage.getClass();
                    int width = pageOpenPage.getWidth();
                    int height = pageOpenPage.getHeight();
                    zk7 zk7Var = pdfDecoder.options;
                    br9 br9Var = zk7Var.d;
                    s39 s39Var = zk7Var.e;
                    br9 br9Var2 = br9.c;
                    int px = xj5.a(br9Var, br9Var2) ? width : PdfDecoderKt.toPx(br9Var.a, s39Var);
                    zk7 zk7Var2 = pdfDecoder.options;
                    br9 br9Var3 = zk7Var2.d;
                    int px2 = xj5.a(br9Var3, br9Var2) ? height : PdfDecoderKt.toPx(br9Var3.b, zk7Var2.e);
                    if (width > 0 && height > 0 && (width != px || height != px2)) {
                        double dG = eo7.g(width, height, px, px2, pdfDecoder.options.e);
                        boolean z = dG < 1.0d;
                        cl8Var.t = z;
                        if (z || !pdfDecoder.options.f) {
                            width = wk6.a(((double) width) * dG);
                            height = wk6.a(dG * ((double) height));
                        }
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    new Canvas(bitmapCreateBitmap).drawColor(-1);
                    pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                    Resources resources = pdfDecoder.options.a.getResources();
                    resources.getClass();
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapCreateBitmap);
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    return bitmapDrawable;
                } catch (SecurityException unused) {
                    parcelFileDescriptor = parcelFileDescriptorOpen;
                    zk7 zk7Var3 = pdfDecoder.options;
                    br9 br9Var4 = zk7Var3.d;
                    s39 s39Var2 = zk7Var3.e;
                    br9 br9Var5 = br9.c;
                    int px3 = 512;
                    int px4 = xj5.a(br9Var4, br9Var5) ? 512 : PdfDecoderKt.toPx(br9Var4.a, s39Var2);
                    zk7 zk7Var4 = pdfDecoder.options;
                    br9 br9Var6 = zk7Var4.d;
                    s39 s39Var3 = zk7Var4.e;
                    if (!xj5.a(br9Var6, br9Var5)) {
                        px3 = PdfDecoderKt.toPx(br9Var6.b, s39Var3);
                    }
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(px4, px3, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap2);
                    canvas.drawColor(-1);
                    Drawable drawable = pdfDecoder.options.a.getDrawable(R.drawable.intercom_ic_document);
                    if (drawable != null) {
                        int iMin = Math.min(px4, px3) / 2;
                        int i = (px4 - iMin) / 2;
                        int i2 = (px3 - iMin) / 2;
                        drawable.setBounds(i, i2, i + iMin, iMin + i2);
                        drawable.draw(canvas);
                    }
                    Resources resources2 = pdfDecoder.options.a.getResources();
                    resources2.getClass();
                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources2, bitmapCreateBitmap2);
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    return bitmapDrawable2;
                } catch (Throwable th) {
                    th = th;
                    parcelFileDescriptor = parcelFileDescriptorOpen;
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SecurityException unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.jn2
    public Object decode(r02<? super in2> r02Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        cl8 cl8Var;
        if (r02Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) r02Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(r02Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(r02Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            dv8.b(obj);
            final cl8 cl8Var2 = new cl8();
            mh4 mh4Var = new mh4() { // from class: zu7
                @Override // defpackage.mh4
                public final Object invoke() {
                    return PdfDecoder.decode$lambda$5(this.t, cl8Var2);
                }
            };
            anonymousClass1.L$0 = cl8Var2;
            anonymousClass1.label = 1;
            Object objG = zv.g(mh4Var, anonymousClass1);
            v72 v72Var = v72.t;
            if (objG == v72Var) {
                return v72Var;
            }
            obj = objG;
            cl8Var = cl8Var2;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cl8Var = (cl8) anonymousClass1.L$0;
            dv8.b(obj);
        }
        return new in2((BitmapDrawable) obj, cl8Var.t);
    }
}
