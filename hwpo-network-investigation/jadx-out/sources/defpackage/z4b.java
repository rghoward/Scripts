package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z4b<Data> implements kx6<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    public final c<Data> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements lx6<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;
        public final boolean b;

        public a(ContentResolver contentResolver, boolean z) {
            this.a = contentResolver;
            this.b = z;
        }

        @Override // z4b.c
        public final xe2<AssetFileDescriptor> a(Uri uri) {
            return new q40(this.a, uri, this.b);
        }

        @Override // defpackage.lx6
        public final kx6<Uri, AssetFileDescriptor> d(i07 i07Var) {
            return new z4b(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements lx6<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;
        public final boolean b;

        public b(ContentResolver contentResolver, boolean z) {
            this.a = contentResolver;
            this.b = z;
        }

        @Override // z4b.c
        public final xe2<ParcelFileDescriptor> a(Uri uri) {
            return new ow3(this.a, uri, this.b);
        }

        @Override // defpackage.lx6
        public final kx6<Uri, ParcelFileDescriptor> d(i07 i07Var) {
            return new z4b(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c<Data> {
        xe2<Data> a(Uri uri);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d implements lx6<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;
        public final boolean b;

        public d(ContentResolver contentResolver, boolean z) {
            this.a = contentResolver;
            this.b = z;
        }

        @Override // z4b.c
        public final xe2<InputStream> a(Uri uri) {
            return new s1a(this.a, uri, this.b);
        }

        @Override // defpackage.lx6
        public final kx6<Uri, InputStream> d(i07 i07Var) {
            return new z4b(this);
        }
    }

    public z4b(c<Data> cVar) {
        this.a = cVar;
    }

    @Override // defpackage.kx6
    public final kx6.a a(Uri uri, int i, int i2, xk7 xk7Var) {
        Uri uri2 = uri;
        return new kx6.a(new ke7(uri2), this.a.a(uri2));
    }

    @Override // defpackage.kx6
    public final boolean b(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
