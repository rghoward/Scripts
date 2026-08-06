package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class kz8<T> extends u02 implements s54<T> {
    public final s54<T> t;
    public final h72 u;
    public final int v;
    public h72 w;
    public r02<? super g2b> x;

    /* JADX WARN: Multi-variable type inference failed */
    public kz8(s54<? super T> s54Var, h72 h72Var) {
        super(eb7.t, ff3.t);
        this.t = s54Var;
        this.u = h72Var;
        this.v = ((Number) h72Var.J(new jz8(), 0)).intValue();
    }

    @Override // defpackage.s54
    public final Object emit(T t, r02<? super g2b> r02Var) {
        try {
            Object objI = i(r02Var, t);
            return objI == v72.t ? objI : g2b.a;
        } catch (Throwable th) {
            this.w = new x43(r02Var.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.ak0, defpackage.w72
    public final w72 getCallerFrame() {
        r02<? super g2b> r02Var = this.x;
        if (r02Var instanceof w72) {
            return (w72) r02Var;
        }
        return null;
    }

    @Override // defpackage.u02, defpackage.r02
    public final h72 getContext() {
        h72 h72Var = this.w;
        return h72Var == null ? ff3.t : h72Var;
    }

    @Override // defpackage.ak0
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object i(r02<? super g2b> r02Var, T t) {
        h72 context = r02Var.getContext();
        sd.d(context);
        h72 h72Var = this.w;
        if (h72Var != context) {
            if (h72Var instanceof x43) {
                throw new IllegalStateException(s2a.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((x43) h72Var).u + ", but then emission attempt of value '" + t + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.J(new ci4() { // from class: mz8
                /* JADX WARN: Code duplicated, block: B:6:0x001d  */
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj).intValue();
                    h72.a aVar = (h72.a) obj2;
                    h72.b<?> key = aVar.getKey();
                    h72.a aVarD0 = this.t.u.d0(key);
                    if (key == el5.a.t) {
                        el5 el5Var = (el5) aVarD0;
                        el5 parent = (el5) aVar;
                        while (true) {
                            if (parent != null) {
                                if (parent == el5Var || !(parent instanceof i59)) {
                                    break;
                                }
                                ac1 ac1VarR = ((i59) parent).R();
                                parent = ac1VarR != null ? ac1VarR.getParent() : null;
                            } else {
                                parent = null;
                                break;
                            }
                        }
                        if (parent != el5Var) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + el5Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                        if (el5Var != null) {
                            iIntValue++;
                        }
                    } else if (aVar != aVarD0) {
                        iIntValue = Integer.MIN_VALUE;
                    } else {
                        iIntValue++;
                    }
                    return Integer.valueOf(iIntValue);
                }
            }, 0)).intValue() != this.v) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.u + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.w = context;
        }
        this.x = r02Var;
        ei4<s54<Object>, Object, r02<? super g2b>, Object> ei4Var = lz8.a;
        s54<T> s54Var = this.t;
        s54Var.getClass();
        Object objInvoke = ei4Var.invoke(s54Var, t, this);
        if (!xj5.a(objInvoke, v72.t)) {
            this.x = null;
        }
        return objInvoke;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        Throwable thA = av8.a(obj);
        if (thA != null) {
            this.w = new x43(getContext(), thA);
        }
        r02<? super g2b> r02Var = this.x;
        if (r02Var != null) {
            r02Var.resumeWith(obj);
        }
        return v72.t;
    }
}
