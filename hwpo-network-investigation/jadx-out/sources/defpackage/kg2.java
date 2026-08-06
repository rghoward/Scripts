package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {390, 391}, m = "invokeSuspend", v = 1)
public final class kg2 extends p6a implements ci4<Boolean, r02<? super ne2<Object>>, Object> {
    public Object t;
    public int u;
    public /* synthetic */ boolean v;
    public final /* synthetic */ xf2<Object> w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg2(xf2<Object> xf2Var, int i, r02<? super kg2> r02Var) {
        super(2, r02Var);
        this.w = xf2Var;
        this.x = i;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        kg2 kg2Var = new kg2(this.w, this.x, r02Var);
        kg2Var.v = ((Boolean) obj).booleanValue();
        return kg2Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(Boolean bool, r02<? super ne2<Object>> r02Var) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((kg2) create(bool2, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        int iIntValue;
        Object obj2;
        int iHashCode;
        int i = this.u;
        xf2<Object> xf2Var = this.w;
        v72 v72Var = v72.t;
        if (i == 0) {
            dv8.b(obj);
            z = this.v;
            this.v = z;
            this.u = 1;
            obj = xf2Var.i(this);
            if (obj != v72Var) {
            }
            return v72Var;
        }
        if (i == 1) {
            z = this.v;
            dv8.b(obj);
        } else {
            if (i != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.t;
            dv8.b(obj);
        }
        iIntValue = ((Number) obj).intValue();
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new ne2(iHashCode, iIntValue, obj2);
        if (z) {
            pg5 pg5VarH = xf2Var.h();
            this.t = obj;
            this.u = 2;
            Object objA = pg5VarH.a(this);
            if (objA != v72Var) {
                Object obj3 = obj;
                obj = objA;
                obj2 = obj3;
                iIntValue = ((Number) obj).intValue();
            }
            return v72Var;
        }
        Object obj4 = obj;
        iIntValue = this.x;
        obj2 = obj4;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new ne2(iHashCode, iIntValue, obj2);
    }
}
