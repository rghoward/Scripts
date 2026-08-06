package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kd5 {
    public final c a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        Uri a();

        void b();

        Uri c();

        ClipDescription d();

        Object e();
    }

    public kd5(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri, clipDescription, uri2);
        } else {
            this.a = new b(uri, clipDescription, uri2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements c {
        public final InputContentInfo a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }

        @Override // kd5.c
        public final Uri a() {
            return this.a.getContentUri();
        }

        @Override // kd5.c
        public final void b() {
            this.a.requestPermission();
        }

        @Override // kd5.c
        public final Uri c() {
            return this.a.getLinkUri();
        }

        @Override // kd5.c
        public final ClipDescription d() {
            return this.a.getDescription();
        }

        @Override // kd5.c
        public final Object e() {
            return this.a;
        }

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements c {
        public final Uri a;
        public final ClipDescription b;
        public final Uri c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // kd5.c
        public final Uri a() {
            return this.a;
        }

        @Override // kd5.c
        public final Uri c() {
            return this.c;
        }

        @Override // kd5.c
        public final ClipDescription d() {
            return this.b;
        }

        @Override // kd5.c
        public final Object e() {
            return null;
        }

        @Override // kd5.c
        public final void b() {
        }
    }

    public kd5(a aVar) {
        this.a = aVar;
    }
}
