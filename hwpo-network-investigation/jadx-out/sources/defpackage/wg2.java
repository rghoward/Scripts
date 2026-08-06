package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.hwpo_training_app.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wg2 extends gka {
    public int A = 0;
    public final TextInputLayout t;
    public final String u;
    public final SimpleDateFormat v;
    public final a21 w;
    public final String x;
    public final ug2 y;
    public vg2 z;

    /* JADX WARN: Type inference failed for: r3v3, types: [ug2] */
    public wg2(final String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, a21 a21Var) {
        this.u = str;
        this.v = simpleDateFormat;
        this.t = textInputLayout;
        this.w = a21Var;
        this.x = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.y = new Runnable() { // from class: ug2
            @Override // java.lang.Runnable
            public final void run() {
                wg2 wg2Var = this.t;
                TextInputLayout textInputLayout2 = wg2Var.t;
                SimpleDateFormat simpleDateFormat2 = wg2Var.v;
                Context context = textInputLayout2.getContext();
                textInputLayout2.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), str.replace(' ', (char) 160)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), simpleDateFormat2.format(new Date(f6b.d().getTimeInMillis())).replace(' ', (char) 160)));
                yp9 yp9Var = (yp9) wg2Var;
                yp9Var.C.getError();
                yp9Var.B.a();
            }
        };
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.u;
        if (length >= str.length() || editable.length() < this.A) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A = charSequence.length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Runnable, vg2] */
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
    @Override // defpackage.gka, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        a21 a21Var = this.w;
        TextInputLayout textInputLayout = this.t;
        ug2 ug2Var = this.y;
        textInputLayout.removeCallbacks(ug2Var);
        textInputLayout.removeCallbacks(this.z);
        textInputLayout.setError(null);
        yp9 yp9Var = (yp9) this;
        yp9Var.D.t = null;
        yp9Var.B.b(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.u.length()) {
            return;
        }
        try {
            Date date = this.v.parse(charSequence.toString());
            textInputLayout.setError(null);
            final long time = date.getTime();
            if (a21Var.v.p(time)) {
                Calendar calendarC = f6b.c(a21Var.t.t);
                calendarC.set(5, 1);
                if (calendarC.getTimeInMillis() <= time) {
                    by6 by6Var = a21Var.u;
                    int i4 = by6Var.x;
                    Calendar calendarC2 = f6b.c(by6Var.t);
                    calendarC2.set(5, i4);
                    if (time <= calendarC2.getTimeInMillis()) {
                        Long lValueOf = Long.valueOf(date.getTime());
                        yp9 yp9Var2 = (yp9) this;
                        yp9Var2.D.t = lValueOf;
                        yp9Var2.B.b(lValueOf);
                        return;
                    }
                }
            }
            ?? r7 = new Runnable() { // from class: vg2
                @Override // java.lang.Runnable
                public final void run() {
                    Calendar calendarD = f6b.d();
                    Calendar calendarE = f6b.e(null);
                    long j = time;
                    calendarE.setTimeInMillis(j);
                    String strA = calendarD.get(1) == calendarE.get(1) ? f6b.b("MMMd", Locale.getDefault()).format(new Date(j)) : xk2.a(j);
                    wg2 wg2Var = this.t;
                    wg2Var.t.setError(String.format(wg2Var.x, strA.replace(' ', (char) 160)));
                    yp9 yp9Var3 = (yp9) wg2Var;
                    yp9Var3.C.getError();
                    yp9Var3.B.a();
                }
            };
            this.z = r7;
            textInputLayout.post(r7);
        } catch (ParseException unused) {
            textInputLayout.post(ug2Var);
        }
    }
}
