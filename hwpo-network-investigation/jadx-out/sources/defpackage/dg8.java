package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dg8<DataT> implements kx6<Uri, DataT> {
    public final Context a;
    public final kx6<File, DataT> b;
    public final kx6<Uri, DataT> c;
    public final Class<DataT> d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a<DataT> implements lx6<Uri, DataT> {
        public final Context a;
        public final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // defpackage.lx6
        public final kx6<Uri, DataT> d(i07 i07Var) {
            Class<DataT> cls = this.b;
            return new dg8(this.a, i07Var.a(File.class, cls), i07Var.a(Uri.class, cls), cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends a<ParcelFileDescriptor> {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends a<InputStream> {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d<DataT> implements xe2<DataT> {
        public static final String[] D = {"_data"};
        public final Class<DataT> A;
        public volatile boolean B;
        public volatile xe2<DataT> C;
        public final Context t;
        public final kx6<File, DataT> u;
        public final kx6<Uri, DataT> v;
        public final Uri w;
        public final int x;
        public final int y;
        public final xk7 z;

        public d(Context context, kx6<File, DataT> kx6Var, kx6<Uri, DataT> kx6Var2, Uri uri, int i, int i2, xk7 xk7Var, Class<DataT> cls) {
            this.t = context.getApplicationContext();
            this.u = kx6Var;
            this.v = kx6Var2;
            this.w = uri;
            this.x = i;
            this.y = i2;
            this.z = xk7Var;
            this.A = cls;
        }

        @Override // defpackage.xe2
        public final Class<DataT> a() {
            return this.A;
        }

        @Override // defpackage.xe2
        public final void b() {
            xe2<DataT> xe2Var = this.C;
            if (xe2Var != null) {
                xe2Var.b();
            }
        }

        @Override // defpackage.xe2
        public final void c(p98 p98Var, xe2.a<? super DataT> aVar) throws Throwable {
            try {
                xe2<DataT> xe2VarD = d();
                if (xe2VarD == null) {
                    aVar.d(new IllegalArgumentException("Failed to build fetcher for: " + this.w));
                } else {
                    this.C = xe2VarD;
                    if (this.B) {
                        cancel();
                    } else {
                        xe2VarD.c(p98Var, aVar);
                    }
                }
            } catch (FileNotFoundException e) {
                aVar.d(e);
            }
        }

        @Override // defpackage.xe2
        public final void cancel() {
            this.B = true;
            xe2<DataT> xe2Var = this.C;
            if (xe2Var != null) {
                xe2Var.cancel();
            }
        }

        public final xe2<DataT> d() throws Throwable {
            kx6.a<DataT> aVarA;
            Throwable th;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            Context context = this.t;
            xk7 xk7Var = this.z;
            int i = this.y;
            int i2 = this.x;
            if (zIsExternalStorageLegacy) {
                Uri uri = this.w;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uri, D, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                aVarA = this.u.a(file, i2, i, xk7Var);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor == null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                int i3 = Build.VERSION.SDK_INT;
                kx6<Uri, DataT> kx6Var = this.v;
                Uri requireOriginal = this.w;
                if (i3 >= 30) {
                    aVarA = kx6Var.a(requireOriginal, i2, i, xk7Var);
                } else {
                    if (uq6.b(requireOriginal)) {
                        Iterator<String> it = requireOriginal.getPathSegments().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                String next = it.next();
                                if (next != null && next.startsWith("picker")) {
                                    aVarA = kx6Var.a(requireOriginal, i2, i, xk7Var);
                                }
                            }
                        }
                    }
                    if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                    }
                    aVarA = kx6Var.a(requireOriginal, i2, i, xk7Var);
                }
            }
            if (aVarA != null) {
                return aVarA.c;
            }
            return null;
        }

        @Override // defpackage.xe2
        public final kf2 getDataSource() {
            return kf2.t;
        }
    }

    public dg8(Context context, kx6<File, DataT> kx6Var, kx6<Uri, DataT> kx6Var2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = kx6Var;
        this.c = kx6Var2;
        this.d = cls;
    }

    @Override // defpackage.kx6
    public final kx6.a a(Uri uri, int i, int i2, xk7 xk7Var) {
        Uri uri2 = uri;
        return new kx6.a(new ke7(uri2), new d(this.a, this.b, this.c, uri2, i, i2, xk7Var, this.d));
    }

    @Override // defpackage.kx6
    public final boolean b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && uq6.b(uri);
    }
}
