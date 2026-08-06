package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sq6 implements kx6<Uri, File> {
    public final Context a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements lx6<Uri, File> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.lx6
        public final kx6<Uri, File> d(i07 i07Var) {
            return new sq6(this.a);
        }
    }

    public sq6(Context context) {
        this.a = context;
    }

    @Override // defpackage.kx6
    public final kx6.a<File> a(Uri uri, int i, int i2, xk7 xk7Var) {
        Uri uri2 = uri;
        return new kx6.a<>(new ke7(uri2), new b(this.a, uri2));
    }

    @Override // defpackage.kx6
    public final boolean b(Uri uri) {
        return uq6.b(uri);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements xe2<File> {
        public static final String[] v = {"_data"};
        public final Context t;
        public final Uri u;

        public b(Context context, Uri uri) {
            this.t = context;
            this.u = uri;
        }

        @Override // defpackage.xe2
        public final Class<File> a() {
            return File.class;
        }

        @Override // defpackage.xe2
        public final void c(p98 p98Var, xe2.a<? super File> aVar) {
            Cursor cursorQuery = this.t.getContentResolver().query(this.u, v, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.e(new File(string));
                return;
            }
            aVar.d(new FileNotFoundException("Failed to find file path for: " + this.u));
        }

        @Override // defpackage.xe2
        public final kf2 getDataSource() {
            return kf2.t;
        }

        @Override // defpackage.xe2
        public final void b() {
        }

        @Override // defpackage.xe2
        public final void cancel() {
        }
    }
}
