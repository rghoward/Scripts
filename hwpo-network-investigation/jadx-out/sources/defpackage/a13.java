package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a13<DataT> implements kx6<Integer, DataT> {
    public final Context a;
    public final e<DataT> b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements lx6<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // a13.e
        public final Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // a13.e
        public final void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // a13.e
        public final Object c(int i, Resources.Theme theme, Resources resources) {
            return resources.openRawResourceFd(i);
        }

        @Override // defpackage.lx6
        public final kx6<Integer, AssetFileDescriptor> d(i07 i07Var) {
            return new a13(this.a, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements lx6<Integer, Drawable>, e<Drawable> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // a13.e
        public final Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // a13.e
        public final /* bridge */ /* synthetic */ void b(Drawable drawable) {
        }

        @Override // a13.e
        public final Object c(int i, Resources.Theme theme, Resources resources) {
            Context context = this.a;
            return n73.a(context, context, i, theme);
        }

        @Override // defpackage.lx6
        public final kx6<Integer, Drawable> d(i07 i07Var) {
            return new a13(this.a, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements lx6<Integer, InputStream>, e<InputStream> {
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // a13.e
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // a13.e
        public final void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // a13.e
        public final Object c(int i, Resources.Theme theme, Resources resources) {
            return resources.openRawResource(i);
        }

        @Override // defpackage.lx6
        public final kx6<Integer, InputStream> d(i07 i07Var) {
            return new a13(this.a, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat);

        Object c(int i, Resources.Theme theme, Resources resources);
    }

    public a13(Context context, e<DataT> eVar) {
        this.a = context.getApplicationContext();
        this.b = eVar;
    }

    @Override // defpackage.kx6
    public final kx6.a a(Integer num, int i, int i2, xk7 xk7Var) {
        Integer num2 = num;
        Resources.Theme theme = (Resources.Theme) xk7Var.c(rt8.b);
        return new kx6.a(new ke7(num2), new d(theme, theme != null ? theme.getResources() : this.a.getResources(), this.b, num2.intValue()));
    }

    @Override // defpackage.kx6
    public final /* bridge */ /* synthetic */ boolean b(Integer num) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d<DataT> implements xe2<DataT> {
        public final Resources.Theme t;
        public final Resources u;
        public final e<DataT> v;
        public final int w;
        public DataT x;

        public d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i) {
            this.t = theme;
            this.u = resources;
            this.v = eVar;
            this.w = i;
        }

        @Override // defpackage.xe2
        public final Class<DataT> a() {
            return this.v.a();
        }

        @Override // defpackage.xe2
        public final void b() {
            DataT datat = this.x;
            if (datat != null) {
                try {
                    this.v.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [DataT, java.lang.Object] */
        @Override // defpackage.xe2
        public final void c(p98 p98Var, xe2.a<? super DataT> aVar) {
            try {
                ?? r4 = (DataT) this.v.c(this.w, this.t, this.u);
                this.x = r4;
                aVar.e(r4);
            } catch (Resources.NotFoundException e) {
                aVar.d(e);
            }
        }

        @Override // defpackage.xe2
        public final kf2 getDataSource() {
            return kf2.t;
        }

        @Override // defpackage.xe2
        public final void cancel() {
        }
    }
}
