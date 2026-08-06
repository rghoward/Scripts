package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uo7<Key, Value> {
    public final Key a;
    public final zr7<Key, Value> b;
    public final qr7 c;
    public final r54<g2b> d;
    public final ry4 e;
    public final AtomicBoolean f;
    public final zx0 g;
    public final hp7.a<Key, Value> h;
    public final gl5 i;
    public final m64 j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[wb6.values().length];
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
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uo7(Object obj, zr7 zr7Var, qr7 qr7Var, rw1 rw1Var, as7 as7Var, qo7.b.a aVar) {
        zr7Var.getClass();
        rw1Var.getClass();
        this.a = obj;
        this.b = zr7Var;
        this.c = qr7Var;
        this.d = rw1Var;
        this.e = new ry4();
        this.f = new AtomicBoolean(false);
        this.g = da1.a(-2, 6, null);
        this.h = new hp7.a<>(qr7Var);
        gl5 gl5VarB = sd.b();
        this.i = gl5VarB;
        this.j = new m64(fp9.a(new z31(gl5VarB, new cp7(this, null), null)), new ep7(this, null));
    }

    public static final Object a(uo7 uo7Var, m64 m64Var, wb6 wb6Var, p6a p6aVar) {
        uo7Var.getClass();
        r54 r54VarA = fp9.a(new a64(m64Var, new vo7(null, uo7Var, wb6Var), null));
        wo7 wo7Var = new wo7(wb6Var, null);
        r54VarA.getClass();
        Object objCollect = yk2.c(new oz8(new y54(r54VarA, wo7Var, null)), -1).collect(new xo7(uo7Var, wb6Var), p6aVar);
        return objCollect == v72.t ? objCollect : g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x039d  */
    /* JADX WARN: Code duplicated, block: B:105:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:108:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:110:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:112:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:113:0x03da  */
    /* JADX WARN: Code duplicated, block: B:116:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:119:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:129:0x043f  */
    /* JADX WARN: Code duplicated, block: B:138:0x046e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0472  */
    /* JADX WARN: Code duplicated, block: B:143:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x0497  */
    /* JADX WARN: Code duplicated, block: B:159:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:163:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:167:0x0506 A[Catch: all -> 0x0515, TryCatch #5 {all -> 0x0515, blocks: (B:164:0x04db, B:165:0x04ed, B:167:0x0506, B:169:0x050e, B:171:0x0512, B:175:0x051b, B:174:0x0519, B:176:0x051e), top: B:237:0x04db }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0512 A[Catch: all -> 0x0515, TryCatch #5 {all -> 0x0515, blocks: (B:164:0x04db, B:165:0x04ed, B:167:0x0506, B:169:0x050e, B:171:0x0512, B:175:0x051b, B:174:0x0519, B:176:0x051e), top: B:237:0x04db }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0519 A[Catch: all -> 0x0515, TryCatch #5 {all -> 0x0515, blocks: (B:164:0x04db, B:165:0x04ed, B:167:0x0506, B:169:0x050e, B:171:0x0512, B:175:0x051b, B:174:0x0519, B:176:0x051e), top: B:237:0x04db }] */
    /* JADX WARN: Code duplicated, block: B:179:0x0548  */
    /* JADX WARN: Code duplicated, block: B:183:0x055b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0564  */
    /* JADX WARN: Code duplicated, block: B:187:0x0568  */
    /* JADX WARN: Code duplicated, block: B:195:0x057f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0585  */
    /* JADX WARN: Code duplicated, block: B:199:0x0589  */
    /* JADX WARN: Code duplicated, block: B:205:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:209:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:215:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:96:0x0369  */
    /* JADX WARN: Code duplicated, block: B:98:0x0371  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [uo7] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v59, types: [uo7] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r11v14, types: [hjb] */
    /* JADX WARN: Type inference failed for: r11v17, types: [l27] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6, types: [wb6] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [wb6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [x37] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Enum, wb6] */
    /* JADX WARN: Type inference failed for: r1v45, types: [x37] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Enum, wb6] */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54, types: [wb6] */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Enum, wb6] */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.Object, wb6] */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r3v1, types: [hjb] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [wb6] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v38, types: [T] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [uo7] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v9, types: [uo7] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.uo7 r23, defpackage.wb6 r24, defpackage.hk4 r25, defpackage.r02 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo7.b(uo7, wb6, hk4, r02):java.lang.Object");
    }

    public static final Object c(uo7 uo7Var, wb6 wb6Var, hjb hjbVar, dp7 dp7Var) throws Throwable {
        uo7Var.getClass();
        if (a.a[wb6Var.ordinal()] == 1) {
            Object objF = uo7Var.f(dp7Var);
            return objF == v72.t ? objF : g2b.a;
        }
        if (hjbVar == null) {
            aa0.c("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
            return null;
        }
        ry4 ry4Var = uo7Var.e;
        ry4Var.getClass();
        wb6 wb6Var2 = wb6.u;
        if (wb6Var != wb6Var2 && wb6Var != wb6.v) {
            r.a(wb6Var, "invalid load type for reset: ");
            return null;
        }
        ry4.b bVar = ry4Var.a;
        bVar.getClass();
        synchronized (bVar.d) {
            ry4.a aVar = bVar.a;
            ry4.a aVar2 = bVar.b;
            aVar.getClass();
            aVar2.getClass();
            if (wb6Var == wb6Var2) {
                aVar.a(hjbVar);
            } else {
                aVar2.a(hjbVar);
            }
        }
        return g2b.a;
    }

    public static final void d(uo7 uo7Var, t72 t72Var) {
        qr7 qr7Var = uo7Var.c;
        oy0.d(t72Var, null, null, new fp7(uo7Var, null), 3);
        oy0.d(t72Var, null, null, new gp7(uo7Var, null), 3);
    }

    public static String h(wb6 wb6Var, Object obj, zr7.b bVar) {
        if (bVar == null) {
            return "End " + wb6Var + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + wb6Var + " with loadKey " + obj + ". Returned " + bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(u02 u02Var) {
        zo7 zo7Var;
        a47 a47Var;
        hp7.a<Key, Value> aVar;
        if (u02Var instanceof zo7) {
            zo7Var = (zo7) u02Var;
            int i = zo7Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                zo7Var.x = i - Integer.MIN_VALUE;
            } else {
                zo7Var = new zo7(this, u02Var);
            }
        } else {
            zo7Var = new zo7(this, u02Var);
        }
        Object obj = zo7Var.v;
        int i2 = zo7Var.x;
        if (i2 == 0) {
            dv8.b(obj);
            hp7.a<Key, Value> aVar2 = this.h;
            a47Var = aVar2.a;
            zo7Var.t = aVar2;
            zo7Var.u = a47Var;
            zo7Var.x = 1;
            Object objB = a47Var.b(zo7Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
            aVar = aVar2;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a47Var = zo7Var.u;
            aVar = zo7Var.t;
            dv8.b(obj);
        }
        try {
            return aVar.b.a(this.e.a.c);
        } finally {
            a47Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01df  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:109:0x0203  */
    /* JADX WARN: Code duplicated, block: B:113:0x0220  */
    /* JADX WARN: Code duplicated, block: B:121:0x022f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ee A[Catch: all -> 0x00b9, PHI: r1
      0x00ee: PHI (r1v8 ??) = (r1v35 ??), (r1v36 ??) binds: [B:43:0x00ea, B:33:0x00b5] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:33:0x00b5, B:45:0x00ee, B:42:0x00de), top: B:129:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:54:0x0128 A[PHI: r15
      0x0128: PHI (r15v8 java.lang.Object) = (r15v7 java.lang.Object), (r15v1 java.lang.Object) binds: [B:52:0x0124, B:31:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x015c A[Catch: all -> 0x0162, TRY_ENTER, TryCatch #0 {all -> 0x0162, blocks: (B:60:0x0142, B:63:0x015c, B:66:0x0165, B:68:0x016c), top: B:125:0x0142 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x016c A[Catch: all -> 0x0162, TRY_LEAVE, TryCatch #0 {all -> 0x0162, blocks: (B:60:0x0142, B:63:0x015c, B:66:0x0165, B:68:0x016c), top: B:125:0x0142 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0176  */
    /* JADX WARN: Code duplicated, block: B:73:0x017a  */
    /* JADX WARN: Code duplicated, block: B:79:0x019a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [x37] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v8, types: [x37] */
    public final Object f(u02 u02Var) throws Throwable {
        ap7 ap7Var;
        x37 x37Var;
        hp7.a<Key, Value> aVar;
        hp7<Key, Value> hp7Var;
        String str;
        zr7<Key, Value> zr7Var;
        zr7.b bVar;
        a47 a47Var;
        zr7.b bVar2;
        a47 a47Var2;
        hp7.a<Key, Value> aVar2;
        boolean zB;
        l27 l27Var;
        Key key;
        ub6.c cVar;
        a47 a47Var3;
        zr7.b bVar3;
        x37 x37Var2;
        zx0 zx0Var;
        oo7.b bVarC;
        x37 x37Var3;
        hp7<Key, Value> hp7Var2;
        ub6.a aVar3;
        if (u02Var instanceof ap7) {
            ap7Var = (ap7) u02Var;
            int i = ap7Var.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                ap7Var.y = i - Integer.MIN_VALUE;
            } else {
                ap7Var = new ap7(this, u02Var);
            }
        } else {
            ap7Var = new ap7(this, u02Var);
        }
        Object objLoad = ap7Var.w;
        ?? r1 = ap7Var.y;
        wb6 wb6Var = wb6.t;
        Key key2 = this.a;
        hp7.a<Key, Value> aVar4 = this.h;
        v72 v72Var = v72.t;
        try {
            switch (r1) {
                case 0:
                    dv8.b(objLoad);
                    a47 a47Var4 = aVar4.a;
                    ap7Var.t = aVar4;
                    ap7Var.u = a47Var4;
                    ap7Var.y = 1;
                    if (a47Var4.b(ap7Var) != v72Var) {
                        x37Var = a47Var4;
                        aVar = aVar4;
                        hp7Var = aVar.b;
                        ap7Var.t = x37Var;
                        ap7Var.u = null;
                        ap7Var.y = 2;
                        r1 = x37Var;
                        if (k(hp7Var, wb6Var, ap7Var) == v72Var) {
                            g2b g2bVar = g2b.a;
                            r1.c(null);
                            zr7.a<Key> aVarG = g(wb6Var, key2);
                            str = Build.ID;
                            zr7Var = this.b;
                            if (str != null && Log.isLoggable("Paging", 3)) {
                                Log.d("Paging", "Start REFRESH with loadKey " + key2 + " on " + zr7Var, null);
                            }
                            ap7Var.t = null;
                            ap7Var.y = 3;
                            objLoad = zr7Var.load(aVarG, ap7Var);
                            if (objLoad != v72Var) {
                                bVar = (zr7.b) objLoad;
                                if (bVar instanceof zr7.b.C0297b) {
                                    a47Var2 = aVar4.a;
                                    ap7Var.t = bVar;
                                    ap7Var.u = aVar4;
                                    ap7Var.v = a47Var2;
                                    ap7Var.y = 4;
                                    if (a47Var2.b(ap7Var) != v72Var) {
                                        aVar2 = aVar4;
                                        try {
                                            hp7<Key, Value> hp7Var3 = aVar2.b;
                                            zB = hp7Var3.b(0, wb6Var, (zr7.b.C0297b) bVar);
                                            l27Var = hp7Var3.h;
                                            l27Var.c(wb6Var, ub6.c.c);
                                            key = ((zr7.b.C0297b) bVar).u;
                                            cVar = ub6.c.b;
                                            if (key == null) {
                                                l27Var.c(wb6.u, cVar);
                                            }
                                            if (((zr7.b.C0297b) bVar).v == null) {
                                                l27Var.c(wb6.v, cVar);
                                                break;
                                            }
                                            a47Var2.c(null);
                                            if (zB) {
                                                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                                    Log.d("Paging", h(wb6Var, key2, bVar), null);
                                                }
                                                a47Var3 = aVar4.a;
                                                ap7Var.t = bVar;
                                                ap7Var.u = aVar4;
                                                ap7Var.v = a47Var3;
                                                ap7Var.y = 5;
                                                if (a47Var3.b(ap7Var) != v72Var) {
                                                    bVar3 = bVar;
                                                    try {
                                                        hp7<Key, Value> hp7Var4 = aVar4.b;
                                                        zx0Var = this.g;
                                                        bVarC = hp7Var4.c((zr7.b.C0297b) bVar3, wb6Var);
                                                        ap7Var.t = bVar3;
                                                        ap7Var.u = a47Var3;
                                                        ap7Var.v = null;
                                                        ap7Var.y = 6;
                                                        if (zx0Var.a(ap7Var, bVarC) != v72Var) {
                                                            x37Var2 = a47Var3;
                                                            g2b g2bVar2 = g2b.a;
                                                            x37Var2.c(null);
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        x37Var2 = a47Var3;
                                                        x37Var2.c(null);
                                                        throw th;
                                                    }
                                                }
                                            } else if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                                Log.v("Paging", h(wb6Var, key2, null), null);
                                            }
                                            return g2b.a;
                                        } catch (Throwable th2) {
                                            a47Var2.c(null);
                                            throw th2;
                                        }
                                    }
                                } else {
                                    if (bVar instanceof zr7.b.a) {
                                        u.b();
                                        return null;
                                    }
                                    if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                        Log.v("Paging", h(wb6Var, key2, bVar), null);
                                    }
                                    a47Var = aVar4.a;
                                    ap7Var.t = bVar;
                                    ap7Var.u = aVar4;
                                    ap7Var.v = a47Var;
                                    ap7Var.y = 8;
                                    if (a47Var.b(ap7Var) != v72Var) {
                                        bVar2 = bVar;
                                        try {
                                            hp7Var2 = aVar4.b;
                                            aVar3 = new ub6.a(((zr7.b.a) bVar2).t);
                                            ap7Var.t = a47Var;
                                            ap7Var.u = null;
                                            ap7Var.v = null;
                                            ap7Var.y = 9;
                                            if (j(hp7Var2, wb6Var, aVar3, ap7Var) != v72Var) {
                                                x37Var3 = a47Var;
                                                g2b g2bVar3 = g2b.a;
                                                x37Var3.c(null);
                                                return g2b.a;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            x37Var3 = a47Var;
                                            x37Var3.c(null);
                                            throw th;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return v72Var;
                case 1:
                    x37 x37Var4 = (x37) ap7Var.u;
                    aVar = (hp7.a) ap7Var.t;
                    dv8.b(objLoad);
                    x37Var = x37Var4;
                    hp7Var = aVar.b;
                    ap7Var.t = x37Var;
                    ap7Var.u = null;
                    ap7Var.y = 2;
                    r1 = x37Var;
                    if (k(hp7Var, wb6Var, ap7Var) == v72Var) {
                        g2b g2bVar4 = g2b.a;
                        r1.c(null);
                        zr7.a<Key> aVarG2 = g(wb6Var, key2);
                        str = Build.ID;
                        zr7Var = this.b;
                        if (str != null) {
                            Log.d("Paging", "Start REFRESH with loadKey " + key2 + " on " + zr7Var, null);
                        }
                        ap7Var.t = null;
                        ap7Var.y = 3;
                        objLoad = zr7Var.load(aVarG2, ap7Var);
                        if (objLoad != v72Var) {
                            bVar = (zr7.b) objLoad;
                            if (bVar instanceof zr7.b.C0297b) {
                                a47Var2 = aVar4.a;
                                ap7Var.t = bVar;
                                ap7Var.u = aVar4;
                                ap7Var.v = a47Var2;
                                ap7Var.y = 4;
                                if (a47Var2.b(ap7Var) != v72Var) {
                                    aVar2 = aVar4;
                                    hp7<Key, Value> hp7Var5 = aVar2.b;
                                    zB = hp7Var5.b(0, wb6Var, (zr7.b.C0297b) bVar);
                                    l27Var = hp7Var5.h;
                                    l27Var.c(wb6Var, ub6.c.c);
                                    key = ((zr7.b.C0297b) bVar).u;
                                    cVar = ub6.c.b;
                                    if (key == null) {
                                        l27Var.c(wb6.u, cVar);
                                    }
                                    if (((zr7.b.C0297b) bVar).v == null) {
                                        l27Var.c(wb6.v, cVar);
                                        break;
                                    }
                                    a47Var2.c(null);
                                    if (zB) {
                                        if (Build.ID != null) {
                                            Log.d("Paging", h(wb6Var, key2, bVar), null);
                                        }
                                        a47Var3 = aVar4.a;
                                        ap7Var.t = bVar;
                                        ap7Var.u = aVar4;
                                        ap7Var.v = a47Var3;
                                        ap7Var.y = 5;
                                        if (a47Var3.b(ap7Var) != v72Var) {
                                            bVar3 = bVar;
                                            hp7<Key, Value> hp7Var6 = aVar4.b;
                                            zx0Var = this.g;
                                            bVarC = hp7Var6.c((zr7.b.C0297b) bVar3, wb6Var);
                                            ap7Var.t = bVar3;
                                            ap7Var.u = a47Var3;
                                            ap7Var.v = null;
                                            ap7Var.y = 6;
                                            if (zx0Var.a(ap7Var, bVarC) != v72Var) {
                                                x37Var2 = a47Var3;
                                                g2b g2bVar5 = g2b.a;
                                                x37Var2.c(null);
                                            }
                                        }
                                    } else if (Build.ID != null) {
                                        Log.v("Paging", h(wb6Var, key2, null), null);
                                    }
                                    return g2b.a;
                                }
                            } else {
                                if (bVar instanceof zr7.b.a) {
                                    u.b();
                                    return null;
                                }
                                if (Build.ID != null) {
                                    Log.v("Paging", h(wb6Var, key2, bVar), null);
                                }
                                a47Var = aVar4.a;
                                ap7Var.t = bVar;
                                ap7Var.u = aVar4;
                                ap7Var.v = a47Var;
                                ap7Var.y = 8;
                                if (a47Var.b(ap7Var) != v72Var) {
                                    bVar2 = bVar;
                                    hp7Var2 = aVar4.b;
                                    aVar3 = new ub6.a(((zr7.b.a) bVar2).t);
                                    ap7Var.t = a47Var;
                                    ap7Var.u = null;
                                    ap7Var.v = null;
                                    ap7Var.y = 9;
                                    if (j(hp7Var2, wb6Var, aVar3, ap7Var) != v72Var) {
                                        x37Var3 = a47Var;
                                        g2b g2bVar6 = g2b.a;
                                        x37Var3.c(null);
                                        return g2b.a;
                                    }
                                }
                            }
                        }
                    }
                    return v72Var;
                case 2:
                    x37 x37Var5 = (x37) ap7Var.t;
                    dv8.b(objLoad);
                    r1 = x37Var5;
                    g2b g2bVar7 = g2b.a;
                    r1.c(null);
                    zr7.a<Key> aVarG3 = g(wb6Var, key2);
                    str = Build.ID;
                    zr7Var = this.b;
                    if (str != null) {
                        Log.d("Paging", "Start REFRESH with loadKey " + key2 + " on " + zr7Var, null);
                    }
                    ap7Var.t = null;
                    ap7Var.y = 3;
                    objLoad = zr7Var.load(aVarG3, ap7Var);
                    if (objLoad != v72Var) {
                        bVar = (zr7.b) objLoad;
                        if (bVar instanceof zr7.b.C0297b) {
                            a47Var2 = aVar4.a;
                            ap7Var.t = bVar;
                            ap7Var.u = aVar4;
                            ap7Var.v = a47Var2;
                            ap7Var.y = 4;
                            if (a47Var2.b(ap7Var) != v72Var) {
                                aVar2 = aVar4;
                                hp7<Key, Value> hp7Var7 = aVar2.b;
                                zB = hp7Var7.b(0, wb6Var, (zr7.b.C0297b) bVar);
                                l27Var = hp7Var7.h;
                                l27Var.c(wb6Var, ub6.c.c);
                                key = ((zr7.b.C0297b) bVar).u;
                                cVar = ub6.c.b;
                                if (key == null) {
                                    l27Var.c(wb6.u, cVar);
                                }
                                if (((zr7.b.C0297b) bVar).v == null) {
                                    l27Var.c(wb6.v, cVar);
                                    break;
                                }
                                a47Var2.c(null);
                                if (zB) {
                                    if (Build.ID != null) {
                                        Log.d("Paging", h(wb6Var, key2, bVar), null);
                                    }
                                    a47Var3 = aVar4.a;
                                    ap7Var.t = bVar;
                                    ap7Var.u = aVar4;
                                    ap7Var.v = a47Var3;
                                    ap7Var.y = 5;
                                    if (a47Var3.b(ap7Var) != v72Var) {
                                        bVar3 = bVar;
                                        hp7<Key, Value> hp7Var8 = aVar4.b;
                                        zx0Var = this.g;
                                        bVarC = hp7Var8.c((zr7.b.C0297b) bVar3, wb6Var);
                                        ap7Var.t = bVar3;
                                        ap7Var.u = a47Var3;
                                        ap7Var.v = null;
                                        ap7Var.y = 6;
                                        if (zx0Var.a(ap7Var, bVarC) != v72Var) {
                                            x37Var2 = a47Var3;
                                            g2b g2bVar8 = g2b.a;
                                            x37Var2.c(null);
                                        }
                                    }
                                } else if (Build.ID != null) {
                                    Log.v("Paging", h(wb6Var, key2, null), null);
                                }
                                return g2b.a;
                            }
                        } else {
                            if (bVar instanceof zr7.b.a) {
                                u.b();
                                return null;
                            }
                            if (Build.ID != null) {
                                Log.v("Paging", h(wb6Var, key2, bVar), null);
                            }
                            a47Var = aVar4.a;
                            ap7Var.t = bVar;
                            ap7Var.u = aVar4;
                            ap7Var.v = a47Var;
                            ap7Var.y = 8;
                            if (a47Var.b(ap7Var) != v72Var) {
                                bVar2 = bVar;
                                hp7Var2 = aVar4.b;
                                aVar3 = new ub6.a(((zr7.b.a) bVar2).t);
                                ap7Var.t = a47Var;
                                ap7Var.u = null;
                                ap7Var.v = null;
                                ap7Var.y = 9;
                                if (j(hp7Var2, wb6Var, aVar3, ap7Var) != v72Var) {
                                    x37Var3 = a47Var;
                                    g2b g2bVar9 = g2b.a;
                                    x37Var3.c(null);
                                    return g2b.a;
                                }
                            }
                        }
                    }
                    return v72Var;
                case 3:
                    dv8.b(objLoad);
                    bVar = (zr7.b) objLoad;
                    if (bVar instanceof zr7.b.C0297b) {
                        a47Var2 = aVar4.a;
                        ap7Var.t = bVar;
                        ap7Var.u = aVar4;
                        ap7Var.v = a47Var2;
                        ap7Var.y = 4;
                        if (a47Var2.b(ap7Var) != v72Var) {
                            aVar2 = aVar4;
                            hp7<Key, Value> hp7Var9 = aVar2.b;
                            zB = hp7Var9.b(0, wb6Var, (zr7.b.C0297b) bVar);
                            l27Var = hp7Var9.h;
                            l27Var.c(wb6Var, ub6.c.c);
                            key = ((zr7.b.C0297b) bVar).u;
                            cVar = ub6.c.b;
                            if (key == null) {
                                l27Var.c(wb6.u, cVar);
                            }
                            if (((zr7.b.C0297b) bVar).v == null) {
                                l27Var.c(wb6.v, cVar);
                                break;
                            }
                            a47Var2.c(null);
                            if (zB) {
                                if (Build.ID != null) {
                                    Log.d("Paging", h(wb6Var, key2, bVar), null);
                                }
                                a47Var3 = aVar4.a;
                                ap7Var.t = bVar;
                                ap7Var.u = aVar4;
                                ap7Var.v = a47Var3;
                                ap7Var.y = 5;
                                if (a47Var3.b(ap7Var) != v72Var) {
                                    bVar3 = bVar;
                                    hp7<Key, Value> hp7Var10 = aVar4.b;
                                    zx0Var = this.g;
                                    bVarC = hp7Var10.c((zr7.b.C0297b) bVar3, wb6Var);
                                    ap7Var.t = bVar3;
                                    ap7Var.u = a47Var3;
                                    ap7Var.v = null;
                                    ap7Var.y = 6;
                                    if (zx0Var.a(ap7Var, bVarC) != v72Var) {
                                        x37Var2 = a47Var3;
                                        g2b g2bVar10 = g2b.a;
                                        x37Var2.c(null);
                                    }
                                }
                            } else if (Build.ID != null) {
                                Log.v("Paging", h(wb6Var, key2, null), null);
                            }
                            return g2b.a;
                        }
                    } else {
                        if (bVar instanceof zr7.b.a) {
                            u.b();
                            return null;
                        }
                        if (Build.ID != null) {
                            Log.v("Paging", h(wb6Var, key2, bVar), null);
                        }
                        a47Var = aVar4.a;
                        ap7Var.t = bVar;
                        ap7Var.u = aVar4;
                        ap7Var.v = a47Var;
                        ap7Var.y = 8;
                        if (a47Var.b(ap7Var) != v72Var) {
                            bVar2 = bVar;
                            hp7Var2 = aVar4.b;
                            aVar3 = new ub6.a(((zr7.b.a) bVar2).t);
                            ap7Var.t = a47Var;
                            ap7Var.u = null;
                            ap7Var.v = null;
                            ap7Var.y = 9;
                            if (j(hp7Var2, wb6Var, aVar3, ap7Var) != v72Var) {
                                x37Var3 = a47Var;
                                g2b g2bVar11 = g2b.a;
                                x37Var3.c(null);
                                return g2b.a;
                            }
                        }
                    }
                    return v72Var;
                case 4:
                    a47Var2 = ap7Var.v;
                    aVar2 = (hp7.a) ap7Var.u;
                    zr7.b bVar4 = (zr7.b) ap7Var.t;
                    dv8.b(objLoad);
                    bVar = bVar4;
                    hp7<Key, Value> hp7Var11 = aVar2.b;
                    zB = hp7Var11.b(0, wb6Var, (zr7.b.C0297b) bVar);
                    l27Var = hp7Var11.h;
                    l27Var.c(wb6Var, ub6.c.c);
                    key = ((zr7.b.C0297b) bVar).u;
                    cVar = ub6.c.b;
                    if (key == null) {
                        l27Var.c(wb6.u, cVar);
                    }
                    if (((zr7.b.C0297b) bVar).v == null) {
                        l27Var.c(wb6.v, cVar);
                        break;
                    }
                    a47Var2.c(null);
                    if (zB) {
                        if (Build.ID != null) {
                            Log.d("Paging", h(wb6Var, key2, bVar), null);
                        }
                        a47Var3 = aVar4.a;
                        ap7Var.t = bVar;
                        ap7Var.u = aVar4;
                        ap7Var.v = a47Var3;
                        ap7Var.y = 5;
                        if (a47Var3.b(ap7Var) != v72Var) {
                            bVar3 = bVar;
                            hp7<Key, Value> hp7Var12 = aVar4.b;
                            zx0Var = this.g;
                            bVarC = hp7Var12.c((zr7.b.C0297b) bVar3, wb6Var);
                            ap7Var.t = bVar3;
                            ap7Var.u = a47Var3;
                            ap7Var.v = null;
                            ap7Var.y = 6;
                            if (zx0Var.a(ap7Var, bVarC) != v72Var) {
                                x37Var2 = a47Var3;
                                g2b g2bVar12 = g2b.a;
                                x37Var2.c(null);
                            }
                        }
                        return v72Var;
                    }
                    if (Build.ID != null) {
                        Log.v("Paging", h(wb6Var, key2, null), null);
                    }
                    return g2b.a;
                case 5:
                    a47Var3 = ap7Var.v;
                    aVar4 = (hp7.a) ap7Var.u;
                    bVar3 = (zr7.b) ap7Var.t;
                    dv8.b(objLoad);
                    hp7<Key, Value> hp7Var13 = aVar4.b;
                    zx0Var = this.g;
                    bVarC = hp7Var13.c((zr7.b.C0297b) bVar3, wb6Var);
                    ap7Var.t = bVar3;
                    ap7Var.u = a47Var3;
                    ap7Var.v = null;
                    ap7Var.y = 6;
                    if (zx0Var.a(ap7Var, bVarC) != v72Var) {
                        x37Var2 = a47Var3;
                        g2b g2bVar13 = g2b.a;
                        x37Var2.c(null);
                        return g2b.a;
                    }
                    return v72Var;
                case 6:
                    x37Var2 = (x37) ap7Var.u;
                    try {
                        dv8.b(objLoad);
                        g2b g2bVar14 = g2b.a;
                        x37Var2.c(null);
                        return g2b.a;
                    } catch (Throwable th4) {
                        th = th4;
                        x37Var2.c(null);
                        throw th;
                    }
                case 7:
                    a47 a47Var5 = ap7Var.v;
                    hp7.a aVar5 = (hp7.a) ap7Var.u;
                    zr7.b bVar5 = (zr7.b) ap7Var.t;
                    dv8.b(objLoad);
                    try {
                        aVar5.b.a(this.e.a.c);
                        a47Var5.c(null);
                        zr7.b.C0297b c0297b = (zr7.b.C0297b) bVar5;
                        c0297b.u.getClass();
                        c0297b.v.getClass();
                        return g2b.a;
                    } catch (Throwable th5) {
                        a47Var5.c(null);
                        throw th5;
                    }
                case 8:
                    a47Var = ap7Var.v;
                    aVar4 = (hp7.a) ap7Var.u;
                    bVar2 = (zr7.b) ap7Var.t;
                    dv8.b(objLoad);
                    hp7Var2 = aVar4.b;
                    aVar3 = new ub6.a(((zr7.b.a) bVar2).t);
                    ap7Var.t = a47Var;
                    ap7Var.u = null;
                    ap7Var.v = null;
                    ap7Var.y = 9;
                    if (j(hp7Var2, wb6Var, aVar3, ap7Var) != v72Var) {
                        x37Var3 = a47Var;
                        g2b g2bVar15 = g2b.a;
                        x37Var3.c(null);
                        return g2b.a;
                    }
                    return v72Var;
                case 9:
                    x37Var3 = (x37) ap7Var.t;
                    try {
                        dv8.b(objLoad);
                        g2b g2bVar16 = g2b.a;
                        x37Var3.c(null);
                        return g2b.a;
                    } catch (Throwable th6) {
                        th = th6;
                        x37Var3.c(null);
                        throw th;
                    }
                default:
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th7) {
            r1.c(null);
            throw th7;
        }
    }

    public final zr7.a<Key> g(wb6 wb6Var, Key key) {
        wb6Var.getClass();
        int iOrdinal = wb6Var.ordinal();
        if (iOrdinal == 0) {
            return new zr7.a.c(key);
        }
        if (iOrdinal == 1) {
            if (key != null) {
                return new zr7.a.b(key);
            }
            z90.a("key cannot be null for prepend");
            return null;
        }
        if (iOrdinal != 2) {
            u.b();
            return null;
        }
        if (key != null) {
            return new zr7.a.C0296a(key);
        }
        z90.a("key cannot be null for append");
        return null;
    }

    public final Key i(hp7<Key, Value> hp7Var, wb6 wb6Var, int i, int i2) {
        hp7Var.getClass();
        int iOrdinal = wb6Var.ordinal();
        if (iOrdinal == 0) {
            z90.a("Cannot get loadId for loadType: REFRESH");
            return null;
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            u.b();
            return null;
        }
        if (i != 0 || (hp7Var.h.a(wb6Var) instanceof ub6.a) || i2 >= this.c.b) {
            return null;
        }
        ArrayList arrayList = hp7Var.c;
        return wb6Var == wb6.u ? ((zr7.b.C0297b) th1.y(arrayList)).u : ((zr7.b.C0297b) th1.G(arrayList)).v;
    }

    public final Object j(hp7 hp7Var, wb6 wb6Var, ub6.a aVar, u02 u02Var) {
        l27 l27Var = hp7Var.h;
        if (xj5.a(l27Var.a(wb6Var), aVar)) {
            return g2b.a;
        }
        l27Var.c(wb6Var, aVar);
        Object objA = this.g.a(u02Var, new oo7.c(l27Var.d(), null));
        return objA == v72.t ? objA : g2b.a;
    }

    public final Object k(hp7 hp7Var, wb6 wb6Var, u02 u02Var) {
        l27 l27Var = hp7Var.h;
        ub6 ub6VarA = l27Var.a(wb6Var);
        ub6.b bVar = ub6.b.b;
        if (xj5.a(ub6VarA, bVar)) {
            return g2b.a;
        }
        l27Var.c(wb6Var, bVar);
        Object objA = this.g.a(u02Var, new oo7.c(l27Var.d(), null));
        return objA == v72.t ? objA : g2b.a;
    }
}
