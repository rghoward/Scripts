package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.hwpo_training_app.R;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kx3 implements as2 {
    public static final a Companion = new a();
    public final bu8 A;
    public oh4<? super c, g2b> B;
    public da C;
    public da D;
    public da E;
    public File F;
    public final ba t;
    public final Context u;
    public final z41 v;
    public final ContentResolver w;
    public final dq0 x;
    public final yw3 y;
    public final k55 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        kx3 a(ba baVar, s66 s66Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class c {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends c {
            public final String a;

            public a(String str) {
                str.getClass();
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && xj5.a(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return sk0.c("Error(error=", this.a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b extends c {
            public final List<rc9> a;

            public b(List<rc9> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && xj5.a(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Success(attachments=" + this.a + ")";
            }
        }
    }

    public kx3(s66 s66Var, ba baVar, Context context, z41 z41Var, ContentResolver contentResolver, dq0 dq0Var, yw3 yw3Var, k55 k55Var, bu8 bu8Var) {
        baVar.getClass();
        context.getClass();
        k55Var.getClass();
        bu8Var.getClass();
        this.t = baVar;
        this.u = context;
        this.v = z41Var;
        this.w = contentResolver;
        this.x = dq0Var;
        this.y = yw3Var;
        this.z = k55Var;
        this.A = bu8Var;
        this.B = new jx3(0);
        s66Var.a(this);
    }

    @Override // defpackage.as2
    public final void H(m76 m76Var) {
        m76Var.getClass();
        v9 v9Var = new v9();
        lx3 lx3Var = new lx3(this);
        ba baVar = this.t;
        this.C = baVar.d("LAUNCH_CAMERA_PHOTO_KEY", v9Var, lx3Var);
        this.D = baVar.d("LAUNCH_GALLERY_VIDEO_KEY", this.v, new mx3(this));
        this.E = baVar.d("LAUNCH_GALLERY_MULTIPLE_KEY", new r9(), new nx3(this));
    }

    public final void a(Set<rc9> set) {
        if (set.isEmpty()) {
            return;
        }
        bu8 bu8Var = this.A;
        StringBuilder sbA = bl2.a(bu8Var.c(R.plurals.following_files_are_too_big, set.size(), new Object[0]));
        sbA.append(th1.F(set, "\n", null, "\n", new ix3(0), 26));
        this.z.getClass();
        sbA.append(bu8Var.b(R.string.maximum_file_size_is, 500));
        this.B.invoke(new c.a(sbA.toString()));
    }

    public final void b() {
        File file = this.F;
        if (file != null) {
            file.delete();
        }
        da daVar = this.E;
        if (daVar != null) {
            daVar.a("*/*");
        } else {
            xj5.e("launchGalleryMultiple");
            throw null;
        }
    }

    public final void c() throws IOException {
        File file = this.F;
        if (file != null) {
            file.delete();
        }
        File fileA = this.y.a();
        this.F = fileA;
        this.z.getClass();
        Uri uriC = wy3.c(fileA, this.u);
        if (uriC != null) {
            da daVar = this.C;
            if (daVar != null) {
                daVar.a(uriC);
            } else {
                xj5.e("launchCameraForPhoto");
                throw null;
            }
        }
    }

    public final void d() {
        File file = this.F;
        if (file != null) {
            file.delete();
        }
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File fileCreateTempFile = File.createTempFile("MP4_" + str + "_", ".mp4", this.y.a.a());
        fileCreateTempFile.getClass();
        this.F = fileCreateTempFile;
        this.z.getClass();
        Uri uriC = wy3.c(fileCreateTempFile, this.u);
        if (uriC != null) {
            da daVar = this.D;
            if (daVar != null) {
                daVar.a(uriC);
            } else {
                xj5.e("launchCameraForVideo");
                throw null;
            }
        }
    }
}
