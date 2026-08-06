package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", l = {143}, m = "invokeSuspend", v = 1)
public final class qo7 extends p6a implements ci4<np9<sr7<Object>>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ po7<Object, Object> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", l = {59, 59}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<s54<? super Boolean>, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(2, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(s54<? super Boolean> s54Var, r02<? super g2b> r02Var) {
            return ((a) create(s54Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            s54 s54Var;
            xm8 xm8Var;
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    s54Var = (s54) this.u;
                    dv8.b(obj);
                    xm8Var = (xm8) obj;
                } else {
                    if (i != 2) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                return g2b.a;
            }
            dv8.b(obj);
            s54Var = (s54) this.u;
            xm8Var = null;
            Boolean boolValueOf = Boolean.valueOf(xm8Var == xm8.t);
            this.u = null;
            this.t = 2;
            Object objEmit = s54Var.emit(boolValueOf, this);
            v72 v72Var = v72.t;
            if (objEmit == v72Var) {
                return v72Var;
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", l = {71, 75}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ei4<po7.a<Object, Object>, Boolean, r02<? super po7.a<Object, Object>>, Object> {
        public zr7 t;
        public int u;
        public /* synthetic */ po7.a v;
        public final /* synthetic */ po7<Object, Object> w;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final /* synthetic */ class a extends pi4 implements mh4<g2b> {
            @Override // defpackage.mh4
            public final g2b invoke() {
                ((po7) this.receiver).c.a(Boolean.TRUE);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r02 r02Var, po7 po7Var) {
            super(3, r02Var);
            this.w = po7Var;
        }

        @Override // defpackage.ei4
        public final Object invoke(po7.a<Object, Object> aVar, Boolean bool, r02<? super po7.a<Object, Object>> r02Var) {
            bool.booleanValue();
            b bVar = new b(r02Var, this.w);
            bVar.v = aVar;
            return bVar.invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005b  */
        /* JADX WARN: Code duplicated, block: B:27:0x005e  */
        /* JADX WARN: Code duplicated, block: B:38:0x0079  */
        /* JADX WARN: Code duplicated, block: B:39:0x007c  */
        /* JADX WARN: Code duplicated, block: B:41:0x007f  */
        /* JADX WARN: Code duplicated, block: B:45:0x0088  */
        /* JADX WARN: Code duplicated, block: B:47:0x008b  */
        /* JADX WARN: Code duplicated, block: B:50:0x0090  */
        /* JADX WARN: Code duplicated, block: B:51:0x0092  */
        /* JADX WARN: Code duplicated, block: B:57:0x00be  */
        /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            po7.a aVar;
            Object objA;
            zr7 zr7Var;
            po7.a aVar2;
            as7 as7Var;
            Collection collection;
            as7 as7Var2;
            Integer num;
            as7 as7Var3;
            Object refreshKey;
            Integer num2;
            as7<Key, Value> as7Var4;
            int i = this.u;
            po7<Object, Object> po7Var = this.w;
            v72 v72Var = v72.t;
            if (i == 0) {
                dv8.b(obj);
                aVar = this.v;
                zr7 zr7Var2 = aVar != null ? aVar.a.b : null;
                this.v = aVar;
                this.u = 1;
                objA = po7.a(po7Var, zr7Var2, this);
                if (objA != v72Var) {
                }
                return v72Var;
            }
            if (i == 1) {
                po7.a aVar3 = this.v;
                dv8.b(obj);
                objA = obj;
                aVar = aVar3;
            } else {
                if (i != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zr7Var = this.t;
                aVar2 = this.v;
                dv8.b(obj);
            }
            as7Var = (as7) obj;
            if (as7Var != null) {
                collection = as7Var.a;
            } else {
                collection = null;
            }
            if ((collection != null || collection.isEmpty()) && aVar2 != null && (as7Var2 = aVar2.b) != null && (!as7Var2.a.isEmpty())) {
            }
            if (as7Var != null) {
                num = as7Var.b;
            } else {
                num = null;
            }
            if (num == null) {
                if (aVar2 != null || (as7Var4 = aVar2.b) == 0) {
                    num2 = null;
                } else {
                    num2 = as7Var4.b;
                }
                if (num2 != null) {
                    as7Var = aVar2.b;
                }
            }
            as7Var3 = as7Var;
            if (as7Var3 == null) {
                refreshKey = null;
            } else {
                refreshKey = zr7Var.getRefreshKey(as7Var3);
                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                    Log.d("Paging", "Refresh key " + refreshKey + " returned from PagingSource " + zr7Var, null);
                }
            }
            if (aVar2 != null) {
                aVar2.a.i.k(null);
            }
            if (aVar2 != null) {
                aVar2.c.k(null);
            }
            return new po7.a(new uo7(refreshKey, zr7Var, po7Var.b, po7Var.d.b, as7Var3, new a(0, po7Var, po7.class, "refresh", "refresh()V", 0)), as7Var3, sd.b());
            zr7Var = (zr7) objA;
            if (aVar != null) {
                uo7<Key, Value> uo7Var = aVar.a;
                this.v = aVar;
                this.t = zr7Var;
                this.u = 2;
                Object objE = uo7Var.e(this);
                if (objE != v72Var) {
                    po7.a aVar4 = aVar;
                    obj = objE;
                    aVar2 = aVar4;
                    as7Var = (as7) obj;
                }
                return v72Var;
            }
            aVar2 = aVar;
            as7Var = null;
            if (as7Var != null) {
                collection = as7Var.a;
            } else {
                collection = null;
            }
            as7Var = collection != null ? as7Var2 : as7Var2;
            if (as7Var != null) {
                num = as7Var.b;
            } else {
                num = null;
            }
            if (num == null) {
                if (aVar2 != null) {
                    num2 = null;
                } else {
                    num2 = null;
                }
                if (num2 != null) {
                    as7Var = aVar2.b;
                }
            }
            as7Var3 = as7Var;
            if (as7Var3 == null) {
                refreshKey = null;
            } else {
                refreshKey = zr7Var.getRefreshKey(as7Var3);
                if (Build.ID != null) {
                    Log.d("Paging", "Refresh key " + refreshKey + " returned from PagingSource " + zr7Var, null);
                }
            }
            if (aVar2 != null) {
                aVar2.a.i.k(null);
            }
            if (aVar2 != null) {
                aVar2.c.k(null);
            }
            return new po7.a(new uo7(refreshKey, zr7Var, po7Var.b, po7Var.d.b, as7Var3, new a(0, po7Var, po7.class, "refresh", "refresh()V", 0)), as7Var3, sd.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", f = "PageFetcher.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends p6a implements ci4<oo7<Object>, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            c cVar = new c(2, r02Var);
            cVar.t = obj;
            return cVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(oo7<Object> oo7Var, r02<? super g2b> r02Var) {
            return ((c) create(oo7Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            oo7 oo7Var = (oo7) this.t;
            if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                Log.v("Paging", "Sent " + oo7Var, null);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d implements s54, mi4 {
        public final /* synthetic */ np9<sr7<Object>> t;

        public d(np9<sr7<Object>> np9Var) {
            this.t = np9Var;
        }

        @Override // defpackage.mi4
        public final di4<?> b() {
            return new pi4(2, this.t, np9.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) {
            Object objA = this.t.a(r02Var, (sr7) obj);
            return objA == v72.t ? objA : g2b.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof s54) && (obj instanceof mi4)) {
                return xj5.a(b(), ((mi4) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", l = {91}, m = "invokeSuspend", v = 1)
    public static final class e extends p6a implements ei4<s54<? super sr7<Object>>, po7.a<Object, Object>, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ s54 u;
        public /* synthetic */ Object v;
        public final /* synthetic */ po7 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r02 r02Var, po7 po7Var) {
            super(3, r02Var);
            this.w = po7Var;
        }

        @Override // defpackage.ei4
        public final Object invoke(s54<? super sr7<Object>> s54Var, po7.a<Object, Object> aVar, r02<? super g2b> r02Var) {
            e eVar = new e(r02Var, this.w);
            eVar.u = s54Var;
            eVar.v = aVar;
            return eVar.invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                s54 s54Var = this.u;
                po7.a aVar = (po7.a) this.v;
                k74 k74Var = new k74(aVar.a.j, new c(2, null));
                po7 po7Var = this.w;
                sr7 sr7Var = new sr7(k74Var, new po7.c(po7Var, po7Var.d), new po7.b(aVar.a), rr7.t);
                this.t = 1;
                Object objEmit = s54Var.emit(sr7Var, this);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo7(r02 r02Var, po7 po7Var) {
        super(2, r02Var);
        this.v = po7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        qo7 qo7Var = new qo7(r02Var, this.v);
        qo7Var.u = obj;
        return qo7Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(np9<sr7<Object>> np9Var, r02<? super g2b> r02Var) {
        return ((qo7) create(np9Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            np9 np9Var = (np9) this.u;
            po7<Object, Object> po7Var = this.v;
            r54 r54VarA = fp9.a(new a64(new j74(new oz8(new z54(new m64(po7Var.c.b, new a(2, null)), new b(null, po7Var), null))), new e(null, po7Var), null));
            d dVar = new d(np9Var);
            this.t = 1;
            Object objCollect = r54VarA.collect(dVar, this);
            v72 v72Var = v72.t;
            if (objCollect == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
