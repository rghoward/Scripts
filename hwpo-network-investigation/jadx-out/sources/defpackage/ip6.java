package defpackage;

import com.hwpo_training_app.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ip6 extends dl0<lp6, a> {
    public static final b Companion = new b();
    public final cm3 A;
    public final yq6 B;
    public final yq6 C;
    public final yq6 D;
    public final yq6 E;
    public final yq6 F;
    public final yq6 G;
    public final pb6 x;
    public final ob6 y;
    public final bu8 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a implements bl0 {

        /* JADX INFO: renamed from: ip6$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0179a extends a {
            public final ArrayList a;

            public C0179a(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0179a) && this.a.equals(((C0179a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ml.a("ClearFilesSelection(items=", this.a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b extends a {
            public final ArrayList a;
            public final int b;

            public b(int i, ArrayList arrayList) {
                this.a = arrayList;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.b == bVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "FilesSelected(items=" + this.a + ", selectedCount=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class c extends a {
            public final sn6 a;
            public final String b;

            public c(sn6 sn6Var, String str) {
                str.getClass();
                this.a = sn6Var;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && xj5.a(this.b, cVar.b);
            }

            public final int hashCode() {
                sn6 sn6Var = this.a;
                return this.b.hashCode() + ((sn6Var == null ? 0 : sn6Var.hashCode()) * 31);
            }

            public final String toString() {
                return "FilterSelected(filterType=" + this.a + ", filterText=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class d extends a {
            public static final d a = new d();
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class e extends a {
            public final ArrayList a;
            public final String b;

            public e(String str, ArrayList arrayList) {
                str.getClass();
                this.a = arrayList;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.a.equals(eVar.a) && xj5.a(this.b, eVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "InitialAttachmentsLoaded(items=" + this.a + ", filterText=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class f extends a {
            public final ArrayList a;

            public f(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a.equals(((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ml.a("NextPageAttachmentsLoaded(items=", this.a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class g extends a {
            public static final g a = new g();
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class h extends a {
            public static final h a = new h();
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class i extends a {
            public static final i a = new i();
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class j extends a {
            public static final j a = new j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[sn6.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip6(pb6 pb6Var, ob6 ob6Var, bu8 bu8Var, cm3 cm3Var) {
        super(lp6.j);
        pb6Var.getClass();
        ob6Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        lp6.Companion.getClass();
        this.x = pb6Var;
        this.y = ob6Var;
        this.z = bu8Var;
        this.A = cm3Var;
        this.B = oh7.a(this.u, new dp6(0));
        this.C = oh7.a(this.u, new ep6(0));
        this.D = oh7.a(this.u, new fp6(0));
        this.E = oh7.a(this.u, new gp6());
        this.F = oh7.a(this.u, new hp6(0));
        this.G = oh7.a(this.u, new t36(1));
        i();
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        int i;
        bl0Var.getClass();
        if (bl0Var instanceof a.i) {
            return lp6.a(b(), null, true, false, false, null, 0, null, null, null, 509);
        }
        if (bl0Var instanceof a.j) {
            return lp6.a(b(), null, false, true, false, null, 0, null, null, null, 507);
        }
        if (bl0Var instanceof a.e) {
            a.e eVar = (a.e) bl0Var;
            return lp6.a(b(), vz7.a(b().a), false, false, false, eVar.a, 0, null, null, eVar.b, 128);
        }
        if (bl0Var instanceof a.f) {
            return lp6.a(b(), vz7.a(b().a), false, false, false, th1.K(b().e, ((a.f) bl0Var).a), 0, null, null, null, 488);
        }
        boolean z = bl0Var instanceof a.b;
        bu8 bu8Var = this.z;
        if (z) {
            lp6 lp6VarB = b();
            a.b bVar = (a.b) bl0Var;
            ArrayList arrayList = bVar.a;
            int i2 = bVar.b;
            return lp6.a(lp6VarB, null, false, false, i2 > 0, arrayList, i2, i2 > 0 ? bu8Var.c(R.plurals.send_files_count, i2, Integer.valueOf(i2)) : null, null, null, 391);
        }
        if (bl0Var instanceof a.C0179a) {
            return lp6.a(b(), null, false, false, false, ((a.C0179a) bl0Var).a, 0, null, null, null, 391);
        }
        if (bl0Var instanceof a.c) {
            a.c cVar = (a.c) bl0Var;
            return lp6.a(b(), null, false, false, false, null, 0, null, cVar.a, cVar.b, 127);
        }
        boolean z2 = bl0Var instanceof a.g;
        hf3 hf3Var = hf3.t;
        if (!z2) {
            return bl0Var instanceof a.h ? lp6.a(b(), new vz7(0, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65), false, false, false, hf3Var, 0, null, null, null, 488) : b();
        }
        lp6 lp6VarB2 = b();
        sn6 sn6Var = b().h;
        int i3 = sn6Var == null ? -1 : c.a[sn6Var.ordinal()];
        int i4 = R.string.photos;
        if (i3 == -1) {
            i = R.string.files;
        } else if (i3 == 1) {
            i = R.string.photos;
        } else if (i3 == 2) {
            i = R.string.videos;
        } else if (i3 != 3) {
            if (i3 != 4) {
                u.b();
                return null;
            }
            i = R.string.files;
        } else {
            i = R.string.youtube;
        }
        String strB = bu8Var.b(R.string.empty_attachments_title, bu8Var.b(i, new Object[0]));
        sn6 sn6Var2 = b().h;
        int i5 = sn6Var2 == null ? -1 : c.a[sn6Var2.ordinal()];
        if (i5 == -1) {
            i4 = R.string.files;
        } else if (i5 != 1) {
            if (i5 == 2) {
                i4 = R.string.videos;
            } else if (i5 != 3) {
                if (i5 != 4) {
                    u.b();
                    return null;
                }
                i4 = R.string.files;
            } else {
                i4 = R.string.youtube;
            }
        }
        return lp6.a(lp6VarB2, new vz7(0, true, false, strB, bu8Var.b(R.string.empty_attachments_desc, bu8Var.b(i4, new Object[0])), null, 97), false, false, false, hf3Var, 0, null, null, null, 384);
    }

    public final String g(sn6 sn6Var) {
        int i;
        int i2 = sn6Var == null ? -1 : c.a[sn6Var.ordinal()];
        if (i2 == -1) {
            i = R.string.filter_all;
        } else if (i2 == 1) {
            i = R.string.filter_photos;
        } else if (i2 == 2) {
            i = R.string.filter_videos;
        } else if (i2 == 3) {
            i = R.string.filter_youtube;
        } else {
            if (i2 != 4) {
                u.b();
                return null;
            }
            i = R.string.filter_files;
        }
        return this.z.b(i, new Object[0]);
    }

    public final void i() {
        oy0.d(rhb.b(this), null, null, new jp6(this, null), 3);
    }
}
