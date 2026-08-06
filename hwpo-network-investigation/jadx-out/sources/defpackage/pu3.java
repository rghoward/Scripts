package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatEditText;
import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pu3 implements TextWatcher {
    public final /* synthetic */ boolean t;
    public final /* synthetic */ oh4 u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ AppCompatEditText w;
    public final /* synthetic */ int x;

    public pu3(boolean z, oh4 oh4Var, boolean z2, AppCompatEditText appCompatEditText, int i) {
        this.t = z;
        this.u = oh4Var;
        this.v = z2;
        this.w = appCompatEditText;
        this.x = i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable == null) {
            return;
        }
        oh4 oh4Var = this.u;
        boolean z = this.t;
        if (!z) {
            if (z) {
                u.b();
                return;
            } else {
                if (editable.length() <= 6) {
                    oh4Var.invoke(editable);
                    return;
                }
                return;
            }
        }
        if (xj5.a(editable.toString(), ".")) {
            return;
        }
        List listI = z2a.I(editable, new String[]{"."}, 6);
        int size = listI.size();
        if (size == 0) {
            oh4Var.invoke(editable);
            return;
        }
        if (size == 1) {
            if (((String) th1.y(listI)).length() <= 6) {
                oh4Var.invoke(editable);
            }
        } else if (size == 2 && ((String) th1.y(listI)).length() <= 6 && ((String) th1.G(listI)).length() <= 2) {
            oh4Var.invoke(editable);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String string;
        String string2;
        AppCompatEditText appCompatEditText = this.w;
        boolean z = this.v;
        if (!z) {
            if (z) {
                u.b();
                return;
            }
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = BuildConfig.FLAVOR;
            }
            if (z2a.w(string)) {
                return;
            }
            boolean z2 = string.length() > 6 || Integer.parseInt(string) > this.x;
            if (z2) {
                string2 = string.substring(0, string.length() - 1);
            } else {
                if (z2) {
                    u.b();
                    return;
                }
                string2 = string.toString();
            }
            if (string.equals(string2)) {
                return;
            }
            appCompatEditText.setText(string2);
            appCompatEditText.setSelection(string2.length());
            return;
        }
        String string3 = charSequence != null ? charSequence.toString() : null;
        if (string3 != null) {
            String str = !z2a.w(string3) ? string3 : null;
            if (str != null) {
                List listI = z2a.I(str, new String[]{"."}, 6);
                String str2 = (String) th1.B(0, listI);
                if (str2 == null) {
                    return;
                }
                String str3 = (String) th1.B(1, listI);
                String strU = a3a.U(6, str2);
                if (strU.length() <= 0) {
                    strU = null;
                }
                if (strU == null) {
                    strU = "0";
                }
                String strConcat = str3 != null ? ".".concat(a3a.U(2, str3)) : null;
                StringBuilder sbA = bl2.a(strU);
                if (strConcat != null) {
                    sbA.append(strConcat);
                }
                String string4 = sbA.toString();
                if (string3.equals(string4)) {
                    return;
                }
                appCompatEditText.setText(string4);
                appCompatEditText.setSelection(string4.length());
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
