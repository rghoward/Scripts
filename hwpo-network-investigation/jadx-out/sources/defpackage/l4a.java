package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class l4a<T> implements zl9<T> {
    public final am9 t;
    public final m11 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {442}, m = "collect", v = 1)
    public static final class a extends u02 {
        public /* synthetic */ Object t;
        public final /* synthetic */ l4a<T> u;
        public int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l4a<T> l4aVar, r02<? super a> r02Var) {
            super(r02Var);
            this.u = l4aVar;
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            this.u.collect(null, this);
            return v72.t;
        }
    }

    public l4a(am9 am9Var, m11 m11Var) {
        this.t = am9Var;
        this.u = m11Var;
    }

    @Override // defpackage.zl9
    public final List<T> a() {
        return this.t.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.r54
    public final Object collect(s54<? super T> s54Var, r02<?> r02Var) throws Throwable {
        a aVar;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i = aVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.v = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, r02Var);
            }
        } else {
            aVar = new a(this, r02Var);
        }
        Object obj = aVar.t;
        int i2 = aVar.v;
        if (i2 == 0) {
            dv8.b(obj);
            k4a k4aVar = new k4a(s54Var, this.u);
            aVar.v = 1;
            this.t.collect(k4aVar, aVar);
            return v72.t;
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        fl.a();
        return null;
    }
}
