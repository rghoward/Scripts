package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {456, 478, 568, 486}, m = "invokeSuspend", v = 1)
public final class wf2 extends p6a implements oh4<r02<? super ne2<Object>>, Object> {
    public final /* synthetic */ xf2<Object> A;
    public final /* synthetic */ xf2<Object>.a B;
    public Object t;
    public Serializable u;
    public Object v;
    public Object w;
    public Iterator x;
    public int y;
    public int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements hc5<Object> {
        public final /* synthetic */ x37 a;
        public final /* synthetic */ cl8 b;
        public final /* synthetic */ gl8<Object> c;
        public final /* synthetic */ xf2<Object> d;

        public a(x37 x37Var, cl8 cl8Var, gl8<Object> gl8Var, xf2<Object> xf2Var) {
            this.a = x37Var;
            this.b = cl8Var;
            this.c = gl8Var;
            this.d = xf2Var;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00a8, B:37:0x00b0), top: B:52:0x004e }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hc5
        public final Object a(cf2 cf2Var, u02 u02Var) throws Throwable {
            vf2 vf2Var;
            x37 x37Var;
            cl8 cl8Var;
            gl8<Object> gl8Var;
            xf2<Object> xf2Var;
            ci4 ci4Var;
            x37 x37Var2;
            x37 x37Var3;
            gl8<Object> gl8Var2;
            T t;
            if (u02Var instanceof vf2) {
                vf2Var = (vf2) u02Var;
                int i = vf2Var.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    vf2Var.A = i - Integer.MIN_VALUE;
                } else {
                    vf2Var = new vf2(this, u02Var);
                }
            } else {
                vf2Var = new vf2(this, u02Var);
            }
            Object obj = vf2Var.y;
            int i2 = vf2Var.A;
            v72 v72Var = v72.t;
            try {
                if (i2 == 0) {
                    dv8.b(obj);
                    vf2Var.t = cf2Var;
                    x37Var = this.a;
                    vf2Var.u = x37Var;
                    cl8Var = this.b;
                    vf2Var.v = cl8Var;
                    gl8Var = this.c;
                    vf2Var.w = gl8Var;
                    xf2Var = this.d;
                    vf2Var.x = xf2Var;
                    vf2Var.A = 1;
                    if (x37Var.b(vf2Var) != v72Var) {
                    }
                    ci4Var = cf2Var;
                    return v72Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = vf2Var.v;
                        gl8Var2 = (gl8) vf2Var.u;
                        x37Var2 = (x37) vf2Var.t;
                        try {
                            dv8.b(obj);
                            t = obj2;
                            gl8Var2.t = t;
                            Object obj3 = gl8Var2.t;
                            x37Var2.c(null);
                            return obj3;
                        } catch (Throwable th) {
                            th = th;
                            x37Var2.c(null);
                            throw th;
                        }
                    }
                    xf2Var = (xf2) vf2Var.v;
                    gl8Var2 = (gl8) vf2Var.u;
                    x37Var3 = (x37) vf2Var.t;
                    try {
                        dv8.b(obj);
                        if (!xj5.a(obj, gl8Var2.t)) {
                            vf2Var.t = x37Var3;
                            vf2Var.u = gl8Var2;
                            vf2Var.v = obj;
                            vf2Var.A = 3;
                            if (xf2Var.j(obj, false, vf2Var) != v72Var) {
                                t = obj;
                                x37Var2 = x37Var3;
                                gl8Var2.t = t;
                            }
                            ci4Var = cf2Var;
                            return v72Var;
                        }
                        x37Var2 = x37Var3;
                        Object obj4 = gl8Var2.t;
                        x37Var2.c(null);
                        return obj4;
                    } catch (Throwable th2) {
                        th = th2;
                        x37Var2 = x37Var3;
                        x37Var2.c(null);
                        throw th;
                    }
                }
                xf2Var = vf2Var.x;
                gl8<Object> gl8Var3 = vf2Var.w;
                cl8Var = (cl8) vf2Var.v;
                x37 x37Var4 = (x37) vf2Var.u;
                ci4 ci4Var2 = (ci4) vf2Var.t;
                dv8.b(obj);
                gl8Var = gl8Var3;
                ci4Var = ci4Var2;
                x37Var = x37Var4;
                ci4Var = cf2Var;
                if (cl8Var.t) {
                    throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                }
                Object obj5 = gl8Var.t;
                vf2Var.t = x37Var;
                vf2Var.u = gl8Var;
                vf2Var.v = xf2Var;
                vf2Var.w = null;
                vf2Var.x = null;
                vf2Var.A = 2;
                Object objInvoke = ci4Var.invoke(obj5, vf2Var);
                if (objInvoke != v72Var) {
                    x37Var3 = x37Var;
                    obj = objInvoke;
                    gl8Var2 = gl8Var;
                    if (!xj5.a(obj, gl8Var2.t)) {
                        vf2Var.t = x37Var3;
                        vf2Var.u = gl8Var2;
                        vf2Var.v = obj;
                        vf2Var.A = 3;
                        if (xf2Var.j(obj, false, vf2Var) != v72Var) {
                            t = obj;
                            x37Var2 = x37Var3;
                            gl8Var2.t = t;
                        }
                    } else {
                        x37Var2 = x37Var3;
                    }
                    Object obj6 = gl8Var2.t;
                    x37Var2.c(null);
                    return obj6;
                }
                ci4Var = cf2Var;
                return v72Var;
            } catch (Throwable th3) {
                th = th3;
                x37Var2 = x37Var;
                x37Var2.c(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf2(xf2<Object> xf2Var, xf2<Object>.a aVar, r02<? super wf2> r02Var) {
        super(1, r02Var);
        this.A = xf2Var;
        this.B = aVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new wf2(this.A, this.B, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super ne2<Object>> r02Var) {
        return ((wf2) create(r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x009d->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        x37 a47Var;
        cl8 cl8Var;
        gl8 gl8Var;
        gl8 gl8Var2;
        x37 x37Var;
        Iterator it;
        x37 x37Var2;
        cl8 cl8Var2;
        gl8 gl8Var3;
        a aVar;
        gl8 gl8Var4;
        cl8 cl8Var3;
        ci4 ci4Var;
        Object obj2;
        int iHashCode;
        Object objA;
        Object obj3;
        int i = this.z;
        xf2<Object>.a aVar2 = this.B;
        xf2<Object> xf2Var = this.A;
        v72 v72Var = v72.t;
        if (i == 0) {
            dv8.b(obj);
            a47Var = new a47();
            cl8Var = new cl8();
            gl8Var = new gl8();
            this.t = a47Var;
            this.u = cl8Var;
            this.v = gl8Var;
            this.w = gl8Var;
            this.z = 1;
            obj = xf2.g(xf2Var, true, this);
            if (obj != v72Var) {
                gl8Var2 = gl8Var;
            }
            return v72Var;
        }
        if (i == 1) {
            gl8Var = (gl8) this.w;
            gl8Var2 = (gl8) this.v;
            cl8Var = (cl8) this.u;
            a47Var = (x37) this.t;
            dv8.b(obj);
        } else {
            if (i == 2) {
                it = this.x;
                aVar = (a) this.w;
                gl8Var3 = (gl8) this.v;
                cl8Var2 = (cl8) this.u;
                x37Var2 = (x37) this.t;
                dv8.b(obj);
                while (it.hasNext()) {
                    ci4Var = (ci4) it.next();
                    this.t = x37Var2;
                    this.u = cl8Var2;
                    this.v = gl8Var3;
                    this.w = aVar;
                    this.x = it;
                    this.z = 2;
                    if (ci4Var.invoke(aVar, this) == v72Var) {
                        return v72Var;
                    }
                }
                gl8Var2 = gl8Var3;
                cl8Var = cl8Var2;
                x37Var = x37Var2;
                aVar2.c = null;
                this.t = cl8Var;
                this.u = gl8Var2;
                this.v = x37Var;
                this.w = null;
                this.x = null;
                this.z = 3;
                if (x37Var.b(this) != v72Var) {
                    gl8Var4 = gl8Var2;
                    cl8Var3 = cl8Var;
                    cl8Var3.t = true;
                    g2b g2bVar = g2b.a;
                    x37Var.c(null);
                    obj2 = gl8Var4.t;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    pg5 pg5VarH = xf2Var.h();
                    this.t = obj2;
                    this.u = null;
                    this.v = null;
                    this.y = iHashCode;
                    this.z = 4;
                    objA = pg5VarH.a(this);
                    if (objA != v72Var) {
                        obj = objA;
                        obj3 = obj2;
                    }
                }
                return v72Var;
            }
            if (i == 3) {
                x37Var = (x37) this.v;
                gl8Var4 = (gl8) this.u;
                cl8Var3 = (cl8) this.t;
                dv8.b(obj);
                try {
                    cl8Var3.t = true;
                    g2b g2bVar2 = g2b.a;
                    x37Var.c(null);
                    obj2 = gl8Var4.t;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    pg5 pg5VarH2 = xf2Var.h();
                    this.t = obj2;
                    this.u = null;
                    this.v = null;
                    this.y = iHashCode;
                    this.z = 4;
                    objA = pg5VarH2.a(this);
                    if (objA != v72Var) {
                        obj = objA;
                        obj3 = obj2;
                    }
                    return v72Var;
                } catch (Throwable th) {
                    x37Var.c(null);
                    throw th;
                }
            }
            if (i != 4) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iHashCode = this.y;
            obj3 = this.t;
            dv8.b(obj);
        }
        return new ne2(iHashCode, ((Number) obj).intValue(), obj3);
        gl8Var.t = ((ne2) obj).b;
        a aVar3 = new a(a47Var, cl8Var, gl8Var2, xf2Var);
        List<? extends ci4<? super hc5<Object>, ? super r02<? super g2b>, ? extends Object>> list = aVar2.c;
        if (list != null) {
            it = list.iterator();
            x37Var2 = a47Var;
            cl8Var2 = cl8Var;
            gl8Var3 = gl8Var2;
            aVar = aVar3;
            while (it.hasNext()) {
                ci4Var = (ci4) it.next();
                this.t = x37Var2;
                this.u = cl8Var2;
                this.v = gl8Var3;
                this.w = aVar;
                this.x = it;
                this.z = 2;
                if (ci4Var.invoke(aVar, this) == v72Var) {
                    return v72Var;
                }
            }
            gl8Var2 = gl8Var3;
            cl8Var = cl8Var2;
            x37Var = x37Var2;
        } else {
            x37Var = a47Var;
        }
        aVar2.c = null;
        this.t = cl8Var;
        this.u = gl8Var2;
        this.v = x37Var;
        this.w = null;
        this.x = null;
        this.z = 3;
        if (x37Var.b(this) != v72Var) {
            gl8Var4 = gl8Var2;
            cl8Var3 = cl8Var;
            cl8Var3.t = true;
            g2b g2bVar3 = g2b.a;
            x37Var.c(null);
            obj2 = gl8Var4.t;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            pg5 pg5VarH3 = xf2Var.h();
            this.t = obj2;
            this.u = null;
            this.v = null;
            this.y = iHashCode;
            this.z = 4;
            objA = pg5VarH3.a(this);
            if (objA != v72Var) {
                obj = objA;
                obj3 = obj2;
                return new ne2(iHashCode, ((Number) obj).intValue(), obj3);
            }
        }
        return v72Var;
    }
}
