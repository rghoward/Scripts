package defpackage;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 273, 282}, m = "invokeSuspend", v = 1)
public final class m18 extends p6a implements ci4<t72, r02<Object>, Object> {
    public x37 t;
    public o18 u;
    public int v;
    public final /* synthetic */ o18 w;
    public final /* synthetic */ ci4<TextClassifier, r02<Object>, Object> x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", f = "PlatformSelectionBehaviors.android.kt", l = {283}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<Object>, Object> {
        public int t;
        public final /* synthetic */ TextClassifier u;
        public final /* synthetic */ ci4<TextClassifier, r02<Object>, Object> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(TextClassifier textClassifier, ci4<? super TextClassifier, ? super r02<Object>, ? extends Object> ci4Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = textClassifier;
            this.v = ci4Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<Object> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return obj;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            TextClassifier textClassifier = this.u;
            if (textClassifier == null) {
                return null;
            }
            this.t = 1;
            Object objInvoke = this.v.invoke(textClassifier, this);
            v72 v72Var = v72.t;
            return objInvoke == v72Var ? v72Var : objInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1", f = "PlatformSelectionBehaviors.android.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super TextClassifier>, Object> {
        public final /* synthetic */ o18 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o18 o18Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.t = o18Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new b(this.t, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super TextClassifier> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            o18 o18Var = this.t;
            TextClassifier textClassifierA = bca.a(o18Var.b, o18Var.c);
            o18Var.f = textClassifierA;
            return textClassifierA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m18(o18 o18Var, ci4<? super TextClassifier, ? super r02<Object>, ? extends Object> ci4Var, r02<? super m18> r02Var) {
        super(2, r02Var);
        this.w = o18Var;
        this.x = ci4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new m18(this.w, this.x, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<Object> r02Var) {
        return ((m18) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0082 A[RETURN] */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        o18 o18Var;
        x37 x37Var;
        x37 x37Var2;
        TextClassifier textClassifierA;
        Object objB;
        int i = this.v;
        v72 v72Var = v72.t;
        try {
            if (i == 0) {
                dv8.b(obj);
                o18Var = this.w;
                x37Var = o18Var.e;
                this.t = x37Var;
                this.u = o18Var;
                this.v = 1;
                if (x37Var.b(this) != v72Var) {
                }
                return v72Var;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        dv8.b(obj);
                        return obj;
                    }
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x37Var2 = this.t;
                try {
                    dv8.b(obj);
                    textClassifierA = vk.a(obj);
                    x37Var = x37Var2;
                    x37Var.c(null);
                    a aVar = new a(textClassifierA, this.x, null);
                    this.t = null;
                    this.u = null;
                    this.v = 3;
                    objB = yoa.b(200L, aVar, this);
                    if (objB == v72Var) {
                        return v72Var;
                    }
                    return objB;
                } catch (Throwable th) {
                    th = th;
                    x37Var2.c(null);
                    throw th;
                }
            }
            o18Var = this.u;
            x37 x37Var3 = this.t;
            dv8.b(obj);
            x37Var = x37Var3;
            textClassifierA = o18Var.f;
            if (textClassifierA == null || textClassifierA.isDestroyed()) {
                b bVar = new b(o18Var, null);
                this.t = x37Var;
                this.u = null;
                this.v = 2;
                Object objB2 = yoa.b(300L, bVar, this);
                if (objB2 != v72Var) {
                    x37Var2 = x37Var;
                    obj = objB2;
                    textClassifierA = vk.a(obj);
                    x37Var = x37Var2;
                    x37Var.c(null);
                    a aVar2 = new a(textClassifierA, this.x, null);
                    this.t = null;
                    this.u = null;
                    this.v = 3;
                    objB = yoa.b(200L, aVar2, this);
                    if (objB == v72Var) {
                        return objB;
                    }
                }
            } else {
                x37Var.c(null);
                a aVar3 = new a(textClassifierA, this.x, null);
                this.t = null;
                this.u = null;
                this.v = 3;
                objB = yoa.b(200L, aVar3, this);
                if (objB == v72Var) {
                    return objB;
                }
            }
            return v72Var;
        } catch (Throwable th2) {
            th = th2;
            x37Var2 = x37Var;
            x37Var2.c(null);
            throw th;
        }
    }
}
