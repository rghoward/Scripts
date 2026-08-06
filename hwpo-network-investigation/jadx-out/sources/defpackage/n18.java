package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 159}, m = "invokeSuspend", v = 1)
public final class n18 extends p6a implements ci4<TextClassifier, r02<? super lja>, Object> {
    public final /* synthetic */ long A;
    public final /* synthetic */ o18 B;
    public a47 t;
    public o18 u;
    public CharSequence v;
    public long w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ CharSequence z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n18(long j, r02 r02Var, o18 o18Var, CharSequence charSequence) {
        super(2, r02Var);
        this.z = charSequence;
        this.A = j;
        this.B = o18Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        n18 n18Var = new n18(this.A, r02Var, this.B, this.z);
        n18Var.y = obj;
        return n18Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(TextClassifier textClassifier, r02<? super lja> r02Var) {
        return ((n18) create(vk.a(textClassifier), r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        o18 o18Var;
        long j;
        TextSelection textSelection;
        CharSequence charSequence;
        a47 a47Var;
        int i = this.x;
        if (i == 0) {
            dv8.b(obj);
            TextClassifier textClassifierA = vk.a(this.y);
            long j2 = this.A;
            int iF = lja.f(j2);
            int iE = lja.e(j2);
            CharSequence charSequence2 = this.z;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, iF, iE);
            o18Var = this.B;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(o18Var.f());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifierA.suggestSelection(defaultLocales.build());
            long jC = ay.c(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            v72 v72Var = v72.t;
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.w = jC;
                this.x = 2;
                if (o18.d(o18Var, this.z, jC, textClassifierA, this) != v72Var) {
                    j = jC;
                }
            } else {
                a47 a47Var2 = o18Var.e;
                this.y = textSelectionSuggestSelection;
                this.t = a47Var2;
                this.u = o18Var;
                this.v = charSequence2;
                this.w = jC;
                this.x = 1;
                if (a47Var2.b(this) != v72Var) {
                    textSelection = textSelectionSuggestSelection;
                    charSequence = charSequence2;
                    a47Var = a47Var2;
                    j = jC;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    o18Var.g.setValue(new aca(charSequence, j, textClassification));
                    g2b g2bVar = g2b.a;
                }
            }
            return v72Var;
        }
        if (i == 1) {
            j = this.w;
            charSequence = this.v;
            o18Var = this.u;
            a47Var = this.t;
            textSelection = (TextSelection) this.y;
            dv8.b(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                o18Var.g.setValue(new aca(charSequence, j, textClassification2));
                g2b g2bVar2 = g2b.a;
            } finally {
                a47Var.c(null);
            }
        } else {
            if (i != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.w;
            dv8.b(obj);
        }
        return new lja(j);
    }
}
