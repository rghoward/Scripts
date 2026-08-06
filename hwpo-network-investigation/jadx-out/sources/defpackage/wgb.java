package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.library.extensions.ViewExtensionsKt$getFlow$1", f = "ViewExtensions.kt", l = {110}, m = "invokeSuspend", v = 2)
public final class wgb extends p6a implements ci4<ua8<? super String>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ AppCompatEditText v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgb(AppCompatEditText appCompatEditText, r02 r02Var) {
        super(2, r02Var);
        this.v = appCompatEditText;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        wgb wgbVar = new wgb(this.v, r02Var);
        wgbVar.u = obj;
        return wgbVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(ua8<? super String> ua8Var, r02<? super g2b> r02Var) {
        return ((wgb) create(ua8Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        ua8 ua8Var = (ua8) this.u;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            a aVar = new a(ua8Var);
            AppCompatEditText appCompatEditText = this.v;
            appCompatEditText.addTextChangedListener(aVar);
            cu1 cu1Var = new cu1(2, appCompatEditText, aVar);
            this.u = null;
            this.t = 1;
            Object objA = qa8.a(ua8Var, cu1Var, this);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements TextWatcher {
        public final /* synthetic */ ua8 t;

        public a(ua8 ua8Var) {
            this.t = ua8Var;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String string;
            if (editable == null || (string = editable.toString()) == null) {
                return;
            }
            this.t.n(string);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
