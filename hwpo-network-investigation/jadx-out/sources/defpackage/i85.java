package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface i85 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements i85 {
        public final com.bumptech.glide.load.data.c a;
        public final o30 b;
        public final List<ImageHeaderParser> c;

        public b(ri6 ri6Var, ArrayList arrayList, o30 o30Var) {
            ov9.d(o30Var, "Argument must not be null");
            this.b = o30Var;
            ov9.d(arrayList, "Argument must not be null");
            this.c = arrayList;
            this.a = new com.bumptech.glide.load.data.c(ri6Var, o30Var);
        }

        @Override // defpackage.i85
        public final int a() {
            bl8 bl8Var = this.a.a;
            bl8Var.reset();
            return com.bumptech.glide.load.a.a(this.c, bl8Var, this.b);
        }

        @Override // defpackage.i85
        public final Bitmap b(BitmapFactory.Options options) {
            bl8 bl8Var = this.a.a;
            bl8Var.reset();
            return qm4.b(bl8Var, options, this);
        }

        @Override // defpackage.i85
        public final boolean c() {
            bl8 bl8Var = this.a.a;
            bl8Var.reset();
            o30 o30Var = this.b;
            bl8Var.mark(5242880);
            List<ImageHeaderParser> list = this.c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    boolean zE = list.get(i).e(bl8Var, o30Var);
                    bl8Var.reset();
                    if (zE) {
                        return true;
                    }
                } catch (Throwable th) {
                    bl8Var.reset();
                    throw th;
                }
            }
            return false;
        }

        @Override // defpackage.i85
        public final void d() {
            bl8 bl8Var = this.a.a;
            synchronized (bl8Var) {
                bl8Var.v = bl8Var.t.length;
            }
        }

        @Override // defpackage.i85
        public final ImageHeaderParser.ImageType e() {
            bl8 bl8Var = this.a.a;
            bl8Var.reset();
            return com.bumptech.glide.load.a.b(this.c, bl8Var, this.b);
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    boolean c();

    void d();

    ImageHeaderParser.ImageType e();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements i85 {
        public final ByteBuffer a;
        public final List<ImageHeaderParser> b;
        public final o30 c;

        public a(ByteBuffer byteBuffer, ArrayList arrayList, o30 o30Var) {
            this.a = byteBuffer;
            this.b = arrayList;
            this.c = o30Var;
        }

        @Override // defpackage.i85
        public final int a() {
            ByteBuffer byteBufferC = yz0.c(this.a);
            o30 o30Var = this.c;
            if (byteBufferC != null) {
                List<ImageHeaderParser> list = this.b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        int iF = list.get(i).f(byteBufferC, o30Var);
                        yz0.c(byteBufferC);
                        if (iF != -1) {
                            return iF;
                        }
                    } catch (Throwable th) {
                        yz0.c(byteBufferC);
                        throw th;
                    }
                }
            }
            return -1;
        }

        @Override // defpackage.i85
        public final Bitmap b(BitmapFactory.Options options) {
            return qm4.b(new yz0.a(yz0.c(this.a)), options, this);
        }

        @Override // defpackage.i85
        public final boolean c() {
            ByteBuffer byteBufferC = yz0.c(this.a);
            o30 o30Var = this.c;
            if (byteBufferC != null) {
                List<ImageHeaderParser> list = this.b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        boolean zB = list.get(i).b(byteBufferC, o30Var);
                        yz0.c(byteBufferC);
                        if (zB) {
                            return true;
                        }
                    } catch (Throwable th) {
                        yz0.c(byteBufferC);
                        throw th;
                    }
                }
            }
            return false;
        }

        @Override // defpackage.i85
        public final ImageHeaderParser.ImageType e() {
            return com.bumptech.glide.load.a.c(this.b, yz0.c(this.a));
        }

        @Override // defpackage.i85
        public final void d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements i85 {
        public final o30 a;
        public final List<ImageHeaderParser> b;
        public final ParcelFileDescriptorRewinder c;

        public c(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, o30 o30Var) {
            ov9.d(o30Var, "Argument must not be null");
            this.a = o30Var;
            ov9.d(arrayList, "Argument must not be null");
            this.b = arrayList;
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // defpackage.i85
        public final int a() throws Throwable {
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            o30 o30Var = this.a;
            List<ImageHeaderParser> list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                bl8 bl8Var = null;
                try {
                    bl8 bl8Var2 = new bl8(new FileInputStream(parcelFileDescriptorRewinder.c().getFileDescriptor()), o30Var);
                    try {
                        int iD = imageHeaderParser.d(bl8Var2, o30Var);
                        bl8Var2.k();
                        parcelFileDescriptorRewinder.c();
                        if (iD != -1) {
                            return iD;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bl8Var = bl8Var2;
                        if (bl8Var != null) {
                            bl8Var.k();
                        }
                        parcelFileDescriptorRewinder.c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return -1;
        }

        @Override // defpackage.i85
        public final Bitmap b(BitmapFactory.Options options) {
            return qm4.a(this.c.c().getFileDescriptor(), options, this);
        }

        @Override // defpackage.i85
        public final boolean c() throws Throwable {
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            o30 o30Var = this.a;
            List<ImageHeaderParser> list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                bl8 bl8Var = null;
                try {
                    bl8 bl8Var2 = new bl8(new FileInputStream(parcelFileDescriptorRewinder.c().getFileDescriptor()), o30Var);
                    try {
                        boolean zE = imageHeaderParser.e(bl8Var2, o30Var);
                        bl8Var2.k();
                        parcelFileDescriptorRewinder.c();
                        if (zE) {
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bl8Var = bl8Var2;
                        if (bl8Var != null) {
                            bl8Var.k();
                        }
                        parcelFileDescriptorRewinder.c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return false;
        }

        @Override // defpackage.i85
        public final ImageHeaderParser.ImageType e() throws Throwable {
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            o30 o30Var = this.a;
            List<ImageHeaderParser> list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                bl8 bl8Var = null;
                try {
                    bl8 bl8Var2 = new bl8(new FileInputStream(parcelFileDescriptorRewinder.c().getFileDescriptor()), o30Var);
                    try {
                        ImageHeaderParser.ImageType imageTypeC = imageHeaderParser.c(bl8Var2);
                        bl8Var2.k();
                        parcelFileDescriptorRewinder.c();
                        if (imageTypeC != ImageHeaderParser.ImageType.UNKNOWN) {
                            return imageTypeC;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bl8Var = bl8Var2;
                        if (bl8Var != null) {
                            bl8Var.k();
                        }
                        parcelFileDescriptorRewinder.c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }

        @Override // defpackage.i85
        public final void d() {
        }
    }
}
