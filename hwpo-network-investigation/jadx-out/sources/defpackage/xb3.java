package defpackage;

import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.ChooseTimeEditText;
import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xb3 implements oh4<zc8, g2b> {
    public final /* synthetic */ rb3 t;

    public xb3(rb3 rb3Var) {
        this.t = rb3Var;
    }

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
    @Override // defpackage.oh4
    public final g2b invoke(zc8 zc8Var) {
        String str;
        String str2;
        String strValueOf;
        String str3;
        zc8 zc8Var2 = zc8Var;
        rb3.a aVar = rb3.Companion;
        final rb3 rb3Var = this.t;
        pe4 pe4VarR = rb3Var.r();
        LinearLayoutCompat linearLayoutCompat = pe4VarR.n;
        int i = zc8Var2.t;
        dd8 dd8Var = zc8Var2.z;
        linearLayoutCompat.setVisibility(i != -1 ? 0 : 8);
        pe4VarR.m.setChecked(dd8Var.A);
        pe4VarR.g.setChecked(dd8Var.B);
        pe4VarR.h.setChecked(dd8Var.C);
        if (zc8Var2.t != -1) {
            LinearLayoutCompat linearLayoutCompat2 = pe4VarR.n;
            linearLayoutCompat2.removeAllViews();
            View viewE = xgb.e(linearLayoutCompat2, R.layout.layout_scoring_details);
            ViewGroup.LayoutParams layoutParams = viewE.getLayoutParams();
            if (layoutParams == null) {
                ac4.c("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) linearLayoutCompat2.getResources().getDimension(R.dimen.default_margin_huge);
            marginLayoutParams.bottomMargin = (int) linearLayoutCompat2.getResources().getDimension(R.dimen.default_margin_small);
            viewE.setLayoutParams(marginLayoutParams);
            linearLayoutCompat2.addView(viewE);
            List<String> list = zc8Var2.y;
            u59 u59Var = zc8Var2.u;
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ws0.m();
                    throw null;
                }
                TextView textView = (TextView) xgb.e(linearLayoutCompat2, R.layout.layout_score_description);
                textView.setText((String) obj);
                if (i2 != 0) {
                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                    if (layoutParams2 == null) {
                        ac4.c("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = (int) linearLayoutCompat2.getResources().getDimension(R.dimen.score_description_text_margin);
                    textView.setLayoutParams(marginLayoutParams2);
                }
                linearLayoutCompat2.addView(textView);
                i2 = i3;
            }
            View viewE2 = xgb.e(linearLayoutCompat2, R.layout.layout_divider);
            ViewGroup.LayoutParams layoutParams3 = viewE2.getLayoutParams();
            if (layoutParams3 == null) {
                ac4.c("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.topMargin = (int) linearLayoutCompat2.getResources().getDimension(R.dimen.default_margin);
            viewE2.setLayoutParams(marginLayoutParams3);
            linearLayoutCompat2.addView(viewE2);
            int i4 = zc8Var2.x;
            boolean zA = u59Var.a();
            String str4 = dd8Var.v;
            int i5 = dd8Var.y;
            int i6 = dd8Var.x;
            List<dd8> list2 = dd8Var.w;
            int i7 = dd8Var.z;
            int i8 = zc8Var2.v;
            String strValueOf2 = i6 == -1 ? BuildConfig.FLAVOR : String.valueOf(i6);
            String strValueOf3 = i5 == -1 ? BuildConfig.FLAVOR : String.valueOf(i5);
            switch (zc8Var2.C.ordinal()) {
                case 0:
                    rb3Var.v(linearLayoutCompat2, zA, i7, str4);
                    break;
                case 1:
                    rb3Var.u(linearLayoutCompat2, i7, str4);
                    break;
                case 2:
                    String str5 = strValueOf2;
                    String str6 = strValueOf3;
                    boolean z = (i5 == -1 || i6 == -1) ? false : true;
                    final int i9 = zc8Var2.v;
                    final int i10 = zc8Var2.w;
                    final ls5 ls5VarInflate = ls5.inflate(LayoutInflater.from(rb3Var.getContext()));
                    ls5VarInflate.getClass();
                    ChooseTimeEditText chooseTimeEditText = ls5VarInflate.d;
                    ChooseTimeEditText chooseTimeEditText2 = ls5VarInflate.e;
                    SwitchMaterial switchMaterial = ls5VarInflate.b;
                    TextInputLayout textInputLayout = ls5VarInflate.h;
                    ChooseTimeEditText chooseTimeEditText3 = ls5VarInflate.l;
                    LinearLayoutCompat linearLayoutCompat3 = ls5VarInflate.a;
                    linearLayoutCompat3.getLayoutTransition().enableTransitionType(3);
                    ls5VarInflate.k.setVisibility(!z ? 0 : 8);
                    ls5VarInflate.j.setVisibility(!z ? 0 : 8);
                    MaterialTextView materialTextView = ls5VarInflate.i;
                    if (i10 == 0) {
                        materialTextView.setVisibility(8);
                        textInputLayout.setVisibility(8);
                    } else {
                        materialTextView.setVisibility(z ? 0 : 8);
                        textInputLayout.setVisibility(z ? 0 : 8);
                    }
                    ls5VarInflate.g.setVisibility(z ? 0 : 8);
                    ls5VarInflate.f.setVisibility(z ? 0 : 8);
                    ls5VarInflate.c.setVisibility(z ? 0 : 8);
                    switchMaterial.setChecked(z);
                    switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: lb3
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                            dd8 dd8VarA;
                            rb3.a aVar2 = rb3.Companion;
                            compoundButton.getClass();
                            rb3 rb3Var2 = rb3Var;
                            pc3 pc3VarS = rb3Var2.s();
                            if (z2) {
                                dd8VarA = dd8.a(pc3VarS.b().d.z, 0.0d, null, null, 0, 0, false, false, false, 975);
                            } else {
                                if (z2) {
                                    u.b();
                                    return;
                                }
                                dd8VarA = dd8.a(pc3VarS.b().d.z, 0.0d, null, null, -1, -1, false, false, false, 975);
                            }
                            pc3VarS.e(new pc3.a.i(zc8.a(pc3VarS.b().d, dd8VarA)));
                            ls5 ls5Var = ls5VarInflate;
                            MaterialTextView materialTextView2 = ls5Var.k;
                            ChooseTimeEditText chooseTimeEditText4 = ls5Var.e;
                            ChooseTimeEditText chooseTimeEditText5 = ls5Var.d;
                            ChooseTimeEditText chooseTimeEditText6 = ls5Var.l;
                            TextInputLayout textInputLayout2 = ls5Var.h;
                            materialTextView2.setVisibility(!z2 ? 0 : 8);
                            ls5Var.j.setVisibility(!z2 ? 0 : 8);
                            MaterialTextView materialTextView3 = ls5Var.i;
                            int i11 = i10;
                            if (i11 == 0) {
                                materialTextView3.setVisibility(8);
                                textInputLayout2.setVisibility(8);
                            } else {
                                materialTextView3.setVisibility(z2 ? 0 : 8);
                                textInputLayout2.setVisibility(z2 ? 0 : 8);
                            }
                            ls5Var.g.setVisibility(z2 ? 0 : 8);
                            ls5Var.f.setVisibility(z2 ? 0 : 8);
                            ls5Var.c.setVisibility(z2 ? 0 : 8);
                            if (!z2) {
                                chooseTimeEditText6.requestFocus();
                                Context context = rb3Var2.getContext();
                                if (context != null) {
                                    xz1.c((ggb.a) context, chooseTimeEditText6);
                                    return;
                                }
                                return;
                            }
                            if (i11 == 0) {
                                chooseTimeEditText5.requestFocus();
                                Context context2 = rb3Var2.getContext();
                                if (context2 != null) {
                                    xz1.c((ggb.a) context2, chooseTimeEditText5);
                                    return;
                                }
                                return;
                            }
                            chooseTimeEditText4.requestFocus();
                            Context context3 = rb3Var2.getContext();
                            if (context3 != null) {
                                xz1.c((ggb.a) context3, chooseTimeEditText4);
                            }
                        }
                    });
                    chooseTimeEditText3.setText(str4);
                    chooseTimeEditText3.setCursorVisible(true);
                    chooseTimeEditText2.setText(str5);
                    chooseTimeEditText.setText(str6);
                    su0.c(chooseTimeEditText3, new mb3(0, rb3Var));
                    od3.c(chooseTimeEditText2, false, i10, new oh4() { // from class: nb3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            String string;
                            Editable editable = (Editable) obj2;
                            rb3.a aVar2 = rb3.Companion;
                            if (editable != null && (string = editable.toString()) != null) {
                                rb3Var.s().m(-1, i10, string);
                            }
                            return g2b.a;
                        }
                    }, 6);
                    od3.c(chooseTimeEditText, false, i9, new oh4() { // from class: ob3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            String string;
                            Editable editable = (Editable) obj2;
                            rb3.a aVar2 = rb3.Companion;
                            if (editable != null && (string = editable.toString()) != null) {
                                rb3Var.s().l(-1, i9, string);
                            }
                            return g2b.a;
                        }
                    }, 6);
                    linearLayoutCompat2.addView(linearLayoutCompat3);
                    break;
                case 3:
                    rb3Var.t(linearLayoutCompat2, i7, i8, strValueOf2, strValueOf3);
                    break;
                case 4:
                    int i11 = 0;
                    while (i11 < i4) {
                        int i12 = i11 + 1;
                        js5 js5VarInflate = js5.inflate(LayoutInflater.from(rb3Var.getContext()));
                        js5VarInflate.getClass();
                        js5VarInflate.b.setText(rb3Var.getString(R.string.interval, Integer.valueOf(i12)));
                        linearLayoutCompat2.addView(js5VarInflate.a);
                        boolean zA2 = u59Var.a();
                        dd8 dd8Var2 = (dd8) th1.B(i11, list2);
                        if (dd8Var2 == null || (str = dd8Var2.v) == null) {
                            str = BuildConfig.FLAVOR;
                        }
                        rb3Var.v(linearLayoutCompat2, zA2, i12, str);
                        i11 = i12;
                    }
                    break;
                case 5:
                    int i13 = 0;
                    while (i13 < i4) {
                        int i14 = i13 + 1;
                        js5 js5VarInflate2 = js5.inflate(LayoutInflater.from(rb3Var.getContext()));
                        js5VarInflate2.getClass();
                        js5VarInflate2.b.setText(rb3Var.getString(R.string.interval, Integer.valueOf(i14)));
                        linearLayoutCompat2.addView(js5VarInflate2.a);
                        dd8 dd8Var3 = (dd8) th1.B(i13, list2);
                        if (dd8Var3 == null || (str2 = dd8Var3.v) == null) {
                            str2 = BuildConfig.FLAVOR;
                        }
                        rb3Var.u(linearLayoutCompat2, i14, str2);
                        i13 = i14;
                    }
                    break;
                case 6:
                    int i15 = 0;
                    while (i15 < i4) {
                        int i16 = i15 + 1;
                        js5 js5VarInflate3 = js5.inflate(LayoutInflater.from(rb3Var.getContext()));
                        js5VarInflate3.getClass();
                        js5VarInflate3.b.setText(rb3Var.getString(R.string.interval, Integer.valueOf(i16)));
                        linearLayoutCompat2.addView(js5VarInflate3.a);
                        dd8 dd8Var4 = list2.get(i15);
                        i15 = i16;
                        int i17 = zc8Var2.v;
                        int i18 = dd8Var4.x;
                        String strValueOf4 = i18 == -1 ? BuildConfig.FLAVOR : String.valueOf(i18);
                        int i19 = dd8Var4.y;
                        if (i19 == -1) {
                            str3 = strValueOf4;
                            strValueOf = BuildConfig.FLAVOR;
                        } else {
                            String str7 = strValueOf4;
                            strValueOf = String.valueOf(i19);
                            str3 = str7;
                        }
                        rb3Var.t(linearLayoutCompat2, i15, i17, str3, strValueOf);
                    }
                    break;
                default:
                    u.b();
                    return null;
            }
        }
        return g2b.a;
    }
}
