package defpackage;

import android.os.Bundle;
import androidx.fragment.app.l;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m5 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ m5(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                final w5 w5Var = (w5) obj2;
                gm3 gm3Var = (gm3) obj;
                w5.a aVar = w5.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof i5.g) {
                    w5Var.m(((i5.g) gm3Var).b);
                } else if (gm3Var instanceof i5.k) {
                    w5Var.n(((i5.k) gm3Var).b);
                } else if (gm3Var instanceof i5.h) {
                    String str = ((i5.h) gm3Var).b;
                    final b6 b6Var = new b6(1, w5Var.q(), e8.class, "onFirstNameUpdated", "onFirstNameUpdated(Ljava/lang/String;)V", 0);
                    w5Var.getChildFragmentManager().f0("RESULT_VALUE_INPUT_DIALOG", w5Var.getViewLifecycleOwner(), new pf4() { // from class: o5
                        @Override // defpackage.pf4
                        public final void d(Bundle bundle, String str2) {
                            w5.a aVar2 = w5.Companion;
                            b6Var.invoke(bundle.getString("arg_value"));
                            w5Var.getChildFragmentManager().e("RESULT_VALUE_INPUT_DIALOG");
                        }
                    });
                    String string = w5Var.getString(R.string.first_name);
                    string.getClass();
                    sab.a aVar2 = sab.Companion;
                    String string2 = w5Var.getString(R.string.first_name_hint);
                    string2.getClass();
                    aVar2.getClass();
                    sab sabVarA = sab.a.a(string, str, string2, string, false);
                    l childFragmentManager = w5Var.getChildFragmentManager();
                    childFragmentManager.getClass();
                    sabVarA.s(childFragmentManager);
                } else if (gm3Var instanceof i5.j) {
                    String str2 = ((i5.j) gm3Var).b;
                    final c6 c6Var = new c6(1, w5Var.q(), e8.class, "onLastNameUpdated", "onLastNameUpdated(Ljava/lang/String;)V", 0);
                    w5Var.getChildFragmentManager().f0("RESULT_VALUE_INPUT_DIALOG", w5Var.getViewLifecycleOwner(), new pf4() { // from class: o5
                        @Override // defpackage.pf4
                        public final void d(Bundle bundle, String str3) {
                            w5.a aVar3 = w5.Companion;
                            c6Var.invoke(bundle.getString("arg_value"));
                            w5Var.getChildFragmentManager().e("RESULT_VALUE_INPUT_DIALOG");
                        }
                    });
                    String string3 = w5Var.getString(R.string.last_name);
                    string3.getClass();
                    sab.a aVar3 = sab.Companion;
                    String string4 = w5Var.getString(R.string.last_name_hint);
                    string4.getClass();
                    aVar3.getClass();
                    sab sabVarA2 = sab.a.a(string3, str2, string4, string3, true);
                    l childFragmentManager2 = w5Var.getChildFragmentManager();
                    childFragmentManager2.getClass();
                    sabVarA2.s(childFragmentManager2);
                } else if (gm3Var instanceof i5.e) {
                    i5.e eVar = (i5.e) gm3Var;
                    gk6 gk6VarA = rh2.a(R.string.select_date_of_birth, eVar.b, eVar.c);
                    final a6 a6Var = new a6(1, w5Var.q(), e8.class, "onBirthdayUpdated", "onBirthdayUpdated(J)V", 0);
                    gk6VarA.J.add((ik6<? super S>) new ik6() { // from class: p5
                        @Override // defpackage.ik6
                        public final void a(Object obj3) {
                            w5.a aVar4 = w5.Companion;
                            a6Var.invoke(obj3);
                        }
                    });
                    hk0.l(w5Var, gk6VarA);
                } else if (gm3Var instanceof i5.m) {
                    String str3 = ((i5.m) gm3Var).b;
                    ey7.Companion.getClass();
                    ey7 ey7Var = new ey7();
                    ey7Var.setArguments(uy0.c(new js7("selected_country_code", str3)));
                    hk0.l(w5Var, ey7Var);
                } else if (gm3Var instanceof i5.l) {
                    hk0.l(w5Var, (yx7) w5Var.C.getValue());
                } else if (gm3Var instanceof i5.c) {
                    w5Var.D.a("image/*");
                } else if (gm3Var instanceof i5.n) {
                    w5Var.E.a(((i5.n) gm3Var).b);
                } else if (gm3Var instanceof i5.b) {
                    l55.b bVar = ((i5.b) gm3Var).b;
                    final z5 z5Var = new z5(0, w5Var.q(), e8.class, "onDeleteAvatarOptionPicked", "onDeleteAvatarOptionPicked()V", 0);
                    w5Var.getChildFragmentManager().f0("result_dialog_confirm", w5Var.getViewLifecycleOwner(), new pf4() { // from class: q5
                        @Override // defpackage.pf4
                        public final void d(Bundle bundle, String str4) {
                            w5.a aVar4 = w5.Companion;
                            w5Var.getChildFragmentManager().e("result_dialog_confirm");
                            if (bundle.getBoolean("arg_dialog_is_confirmed")) {
                                z5Var.invoke();
                            }
                        }
                    });
                    m55.Companion.getClass();
                    hk0.l(w5Var, m55.a.a(bVar));
                } else if (gm3Var instanceof i5.a) {
                    l55.b bVar2 = ((i5.a) gm3Var).b;
                    final y5 y5Var = new y5(0, w5Var.q(), e8.class, "onDeleteAccountOptionPicked", "onDeleteAccountOptionPicked()V", 0);
                    w5Var.getChildFragmentManager().f0("result_dialog_confirm", w5Var.getViewLifecycleOwner(), new pf4() { // from class: q5
                        @Override // defpackage.pf4
                        public final void d(Bundle bundle, String str4) {
                            w5.a aVar4 = w5.Companion;
                            w5Var.getChildFragmentManager().e("result_dialog_confirm");
                            if (bundle.getBoolean("arg_dialog_is_confirmed")) {
                                y5Var.invoke();
                            }
                        }
                    });
                    m55.Companion.getClass();
                    hk0.l(w5Var, m55.a.a(bVar2));
                } else if (gm3Var instanceof i5.f) {
                    o81.Companion.getClass();
                    hk0.l(w5Var, new o81());
                } else if (gm3Var instanceof i5.i) {
                    ic4.Companion.getClass();
                    hk0.l(w5Var, new ic4());
                } else if (gm3Var instanceof i5.d) {
                    q6.Companion.getClass();
                    hk0.l(w5Var, new q6());
                }
                return g2b.a;
            case 1:
                ec9.d((String) obj2, (hc9) obj);
                return g2b.a;
            case 2:
                z79 z79Var = (z79) obj2;
                return new vf7(z79Var.c(z79Var.k, ((vf7) obj).a, z79Var.j));
            default:
                String str4 = (String) obj;
                int i2 = o9b.m0;
                str4.getClass();
                ((o9b) obj2).f(new atb(str4));
                return g2b.a;
        }
    }
}
