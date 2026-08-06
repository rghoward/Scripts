package com.hwpo_training_app.settings.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.hwpo_training_app.settings.presentation.view.AccountSettingsView;
import defpackage.d7;
import defpackage.e7;
import defpackage.f7;
import defpackage.g2b;
import defpackage.g7;
import defpackage.ll8;
import defpackage.o33;
import defpackage.oh4;
import defpackage.qq2;
import defpackage.s10;
import defpackage.sd1;
import defpackage.u;
import defpackage.vfb;
import defpackage.wj4;
import defpackage.xfb;
import defpackage.zlb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AccountSettingsView extends LinearLayout {
    public static final /* synthetic */ int C = 0;
    public oh4<? super o33, g2b> A;
    public oh4<? super s10, g2b> B;
    public final vfb t;
    public s10 u;
    public wj4 v;
    public zlb w;
    public o33 x;
    public oh4<? super wj4, g2b> y;
    public oh4<? super zlb, g2b> z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[s10.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[wj4.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[zlb.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            c = iArr3;
            int[] iArr4 = new int[o33.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            d = iArr4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        Context context2 = getContext();
        context2.getClass();
        sd1 sd1VarA = ll8.a(vfb.class);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
        layoutInflaterFrom.getClass();
        final vfb vfbVar = (vfb) xfb.a(sd1VarA, layoutInflaterFrom, this, true);
        this.t = vfbVar;
        int i2 = 0;
        this.y = new d7(i2);
        this.z = new e7(i2);
        this.A = new f7(0);
        this.B = new g7(0);
        vfbVar.i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: z6
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i3) {
                wj4 wj4Var;
                int i4 = AccountSettingsView.C;
                radioGroup.getClass();
                vfb vfbVar2 = vfbVar;
                if (i3 == vfbVar2.l.getId()) {
                    wj4Var = wj4.t;
                } else if (i3 == vfbVar2.g.getId()) {
                    wj4Var = wj4.u;
                } else {
                    wj4Var = i3 == vfbVar2.m.getId() ? wj4.v : null;
                }
                if (wj4Var != null) {
                    this.y.invoke(wj4Var);
                }
            }
        });
        vfbVar.o.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: a7
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i3) {
                zlb zlbVar;
                int i4 = AccountSettingsView.C;
                radioGroup.getClass();
                vfb vfbVar2 = vfbVar;
                if (i3 == vfbVar2.j.getId()) {
                    zlbVar = zlb.t;
                } else {
                    zlbVar = i3 == vfbVar2.n.getId() ? zlb.u : null;
                }
                if (zlbVar != null) {
                    this.z.invoke(zlbVar);
                }
            }
        });
        vfbVar.c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: b7
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i3) {
                o33 o33Var;
                int i4 = AccountSettingsView.C;
                radioGroup.getClass();
                vfb vfbVar2 = vfbVar;
                if (i3 == vfbVar2.b.getId()) {
                    o33Var = o33.t;
                } else {
                    o33Var = i3 == vfbVar2.d.getId() ? o33.u : null;
                }
                if (o33Var != null) {
                    this.A.invoke(o33Var);
                }
            }
        });
        vfbVar.k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: c7
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i3) {
                s10 s10Var;
                int i4 = AccountSettingsView.C;
                radioGroup.getClass();
                vfb vfbVar2 = vfbVar;
                if (i3 == vfbVar2.e.getId()) {
                    s10Var = s10.ENGLISH;
                } else if (i3 == vfbVar2.h.getId()) {
                    s10Var = s10.FRANCAIS;
                } else {
                    s10Var = i3 == vfbVar2.f.getId() ? s10.ESPANOL : null;
                }
                if (s10Var != null) {
                    this.B.invoke(s10Var);
                }
            }
        });
    }

    public final o33 getDistanceUnits() {
        return this.x;
    }

    public final wj4 getGender() {
        return this.v;
    }

    public final s10 getLanguage() {
        return this.u;
    }

    public final oh4<o33, g2b> getOnDistanceUnitsChangeListener() {
        return this.A;
    }

    public final oh4<wj4, g2b> getOnGenderChangeListener() {
        return this.y;
    }

    public final oh4<s10, g2b> getOnLanguageChangeListener() {
        return this.B;
    }

    public final oh4<zlb, g2b> getOnWeightUnitsChangeListener() {
        return this.z;
    }

    public final zlb getWeightUnits() {
        return this.w;
    }

    public final void setDistanceUnits(o33 o33Var) {
        this.x = o33Var;
        int i = o33Var == null ? -1 : a.d[o33Var.ordinal()];
        vfb vfbVar = this.t;
        if (i == -1) {
            vfbVar.c.clearCheck();
            return;
        }
        if (i == 1) {
            vfbVar.b.setChecked(true);
        } else if (i == 2) {
            vfbVar.d.setChecked(true);
        } else {
            u.b();
        }
    }

    public final void setGender(wj4 wj4Var) {
        this.v = wj4Var;
        int i = wj4Var == null ? -1 : a.b[wj4Var.ordinal()];
        vfb vfbVar = this.t;
        if (i == -1) {
            vfbVar.i.clearCheck();
            return;
        }
        if (i == 1) {
            vfbVar.l.setChecked(true);
            return;
        }
        if (i == 2) {
            vfbVar.g.setChecked(true);
        } else if (i == 3) {
            vfbVar.m.setChecked(true);
        } else {
            u.b();
        }
    }

    public final void setLanguage(s10 s10Var) {
        this.u = s10Var;
        int i = s10Var == null ? -1 : a.a[s10Var.ordinal()];
        vfb vfbVar = this.t;
        if (i == 1) {
            vfbVar.e.setChecked(true);
            return;
        }
        if (i == 2) {
            vfbVar.h.setChecked(true);
        } else if (i != 3) {
            vfbVar.k.clearCheck();
        } else {
            vfbVar.f.setChecked(true);
        }
    }

    public final void setOnDistanceUnitsChangeListener(oh4<? super o33, g2b> oh4Var) {
        oh4Var.getClass();
        this.A = oh4Var;
    }

    public final void setOnGenderChangeListener(oh4<? super wj4, g2b> oh4Var) {
        oh4Var.getClass();
        this.y = oh4Var;
    }

    public final void setOnLanguageChangeListener(oh4<? super s10, g2b> oh4Var) {
        oh4Var.getClass();
        this.B = oh4Var;
    }

    public final void setOnWeightUnitsChangeListener(oh4<? super zlb, g2b> oh4Var) {
        oh4Var.getClass();
        this.z = oh4Var;
    }

    public final void setWeightUnits(zlb zlbVar) {
        this.w = zlbVar;
        int i = zlbVar == null ? -1 : a.c[zlbVar.ordinal()];
        vfb vfbVar = this.t;
        if (i == -1) {
            vfbVar.o.clearCheck();
            return;
        }
        if (i == 1) {
            vfbVar.j.setChecked(true);
        } else if (i == 2) {
            vfbVar.n.setChecked(true);
        } else {
            u.b();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccountSettingsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccountSettingsView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ AccountSettingsView(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
