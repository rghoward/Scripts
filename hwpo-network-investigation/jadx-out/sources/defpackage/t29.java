package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t29 {
    public static final au3 A;
    public static final au3 B;
    public static final au3 C;
    public static final u29 E;
    public static final au3 b;
    public static final au3 c;
    public static final au3 e;
    public static final au3 f;
    public static final au3 g;
    public static final au3 i;
    public static final au3 l;
    public static final au3 m;
    public static final au3 n;
    public static final au3 o;
    public static final au3 p;
    public static final au3 q;
    public static final u29 s;
    public static final u29 y;
    public static final au3 a = new au3(new l19(), new n19());
    public static final au3 d = new au3(new n29(), new en4(1));
    public static final au3 h = new au3(new o29(), new q29());
    public static final au3 j = new au3(new s29(), new m19());
    public static final au3 k = new au3(new o19(), new an5(1));
    public static final u29 r = new u29(a.t, b.t);
    public static final u29 t = new u29(new v19(), new w19(0));
    public static final u29 u = new u29(new x19(0), new y19(0));
    public static final au3 v = new au3(new z19(), new qm0(1));
    public static final au3 w = new au3(new a29(), new b29(0));
    public static final u29 x = new u29(new c29(), new d29());
    public static final u29 z = new u29(new e29(), new f91(1));
    public static final u29 D = new u29(new j29(), new k29(0));
    public static final u29 F = new u29(new m29(), new n10(2));

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ci4<k19, uh1, Object> {
        public static final a t = new a();

        @Override // defpackage.ci4
        public final Object invoke(k19 k19Var, uh1 uh1Var) {
            long j = uh1Var.a;
            return j == 16 ? Boolean.FALSE : Integer.valueOf(u7d.l(j));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements oh4<Object, uh1> {
        public static final b t = new b();

        @Override // defpackage.oh4
        public final uh1 invoke(Object obj) {
            if (xj5.a(obj, Boolean.FALSE)) {
                return new uh1(uh1.k);
            }
            obj.getClass();
            return new uh1(u7d.c(((Integer) obj).intValue()));
        }
    }

    static {
        int i2 = 1;
        b = new au3(new t19(), new kf3(i2));
        int i3 = 2;
        c = new au3(new f29(), new jx3(i3));
        e = new au3(new p29(), new y75(i2));
        f = new au3(new r19(), new kg(i2));
        int i4 = 3;
        g = new au3(new a56(i2), new r56(i4));
        i = new au3(new r29(), new gt6(i2));
        l = new au3(new sv7(i2), new p19());
        m = new au3(new g46(i2), new f71(i2));
        n = new au3(new q19(), new xl0(i4));
        o = new au3(new s19(), new am0(i3));
        p = new au3(new dg(i3), new eg(i2));
        q = new au3(new ev3(i2), new q46(i2));
        s = new u29(new u19(), new ig(i2));
        y = new u29(new ad7(1), new d91(i4));
        A = new au3(new g29(), new i91(i2));
        B = new au3(new h29(), new cg8(i2));
        C = new au3(new i29(), new ky7(i2));
        E = new u29(new l29(), new ix3(i4));
    }

    public static final <T extends i19<Original, Saveable>, Original, Saveable> Object a(Original original, T t2, k19 k19Var) {
        Object objC;
        return (original == null || (objC = t2.c(k19Var, original)) == null) ? Boolean.FALSE : objC;
    }
}
