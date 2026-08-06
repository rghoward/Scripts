package com.hwpo_training_app.core.widget.benchamrks;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.ChooseTimeEditText;
import com.hwpo_training_app.core.widget.benchamrks.BenchmarksTextSectionLayout;
import com.intercom.twig.BuildConfig;
import defpackage.a0a;
import defpackage.b0a;
import defpackage.js7;
import defpackage.m2b;
import defpackage.o96;
import defpackage.od3;
import defpackage.oh4;
import defpackage.p96;
import defpackage.q96;
import defpackage.qq2;
import defpackage.su0;
import defpackage.vn0;
import defpackage.wfb;
import defpackage.wn0;
import defpackage.ws0;
import defpackage.wx7;
import defpackage.xn0;
import defpackage.yk2;
import defpackage.z2a;
import defpackage.zl9;
import io.ably.lib.util.AgentHeaderCreator;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class BenchmarksTextSectionLayout extends LinearLayoutCompat {
    public static final /* synthetic */ int L = 0;
    public HashMap I;
    public final a0a J;
    public final LinkedHashMap K;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends View.BaseSavedState {
        public HashMap<Integer, String> t;
        public static final b Companion = new b();
        public static final Parcelable.Creator<a> CREATOR = new C0062a();

        /* JADX INFO: renamed from: com.hwpo_training_app.core.widget.benchamrks.BenchmarksTextSectionLayout$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0062a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b {
        }

        public a(Parcel parcel) {
            Object serializable;
            super(parcel);
            this.t = new HashMap<>();
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = parcel.readSerializable(HashMap.class.getClassLoader(), HashMap.class);
            } else {
                Serializable serializable2 = parcel.readSerializable();
                serializable = (HashMap) (serializable2 instanceof HashMap ? serializable2 : null);
            }
            serializable.getClass();
            this.t = (HashMap) serializable;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            super.writeToParcel(parcel, i);
            parcel.writeSerializable(this.t);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenchmarksTextSectionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.I = new LinkedHashMap();
        this.J = b0a.b(new HashMap());
        this.K = new LinkedHashMap();
    }

    public static int j(vn0 vn0Var) {
        xn0 xn0Var = vn0Var.z;
        boolean z = xn0Var == xn0.u;
        boolean z2 = vn0Var.y == m2b.u;
        boolean z3 = xn0Var == xn0.t;
        boolean z4 = xn0Var == xn0.x;
        if (!z || z2) {
            return (z3 || z4) ? 8194 : 2;
        }
        return 36;
    }

    public final zl9<HashMap<Integer, String>> getBenchmarkUpdatesFlow() {
        return yk2.a(this.J);
    }

    public final HashMap<Integer, String> getBenchmarksText() {
        return new HashMap<>(this.I);
    }

    public final String i(vn0 vn0Var) {
        xn0 xn0Var = vn0Var.z;
        String str = vn0Var.x;
        String string = vn0Var.u;
        if (xn0Var == xn0.u && vn0Var.y != m2b.u) {
            string = getResources().getString(R.string.benchmark_name_time, string);
        } else if (!z2a.w(str)) {
            string = getResources().getString(R.string.value_with_measure_in_parentheses, string, str);
        }
        string.getClass();
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ee A[SYNTHETIC] */
    public final void k(String str, List list) {
        wfb wfbVar;
        wfb wfbVar2;
        int dimension;
        list.getClass();
        LinkedHashMap linkedHashMap = this.K;
        linkedHashMap.clear();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ws0.m();
                throw null;
            }
            final vn0 vn0Var = (vn0) obj;
            xn0 xn0Var = vn0Var.z;
            int i3 = vn0Var.t;
            boolean z = vn0Var.A;
            if (xn0Var != xn0.u || vn0Var.y == m2b.u) {
                if (xn0Var == xn0.D) {
                    final q96 q96VarInflate = q96.inflate(LayoutInflater.from(getContext()), this, true);
                    q96VarInflate.c.setId(View.generateViewId());
                    linkedHashMap.put(Integer.valueOf(i3), Integer.valueOf(q96VarInflate.c.getId()));
                    ChooseTimeEditText chooseTimeEditText = q96VarInflate.d;
                    chooseTimeEditText.setCursorVisible(true);
                    ChooseTimeEditText chooseTimeEditText2 = q96VarInflate.b;
                    chooseTimeEditText2.setCursorVisible(true);
                    if (!z) {
                        js7<String, String> js7VarH = wn0.h(wn0.e(vn0Var));
                        String str2 = js7VarH.t;
                        String str3 = js7VarH.u;
                        chooseTimeEditText.setText(str2);
                        chooseTimeEditText2.setText(str3);
                    }
                    String str4 = (String) this.I.getOrDefault(Integer.valueOf(i3), null);
                    if (str4 != null) {
                        js7<String, String> js7VarH2 = wn0.h(str4);
                        String str5 = js7VarH2.t;
                        String str6 = js7VarH2.u;
                        chooseTimeEditText.setText(str5);
                        chooseTimeEditText2.setText(str6);
                    }
                    oh4 oh4Var = new oh4() { // from class: zo0
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            int i4 = BenchmarksTextSectionLayout.L;
                            int i5 = vn0Var.t;
                            q96 q96Var = q96VarInflate;
                            this.t.l(i5, ((Object) q96Var.d.getText()) + AgentHeaderCreator.AGENT_DIVIDER + ((Object) q96Var.b.getText()));
                            return g2b.a;
                        }
                    };
                    od3.c(chooseTimeEditText, xn0Var.a(), 0, oh4Var, 14);
                    od3.c(chooseTimeEditText2, xn0Var.a(), 0, oh4Var, 14);
                    int iJ = j(vn0Var);
                    chooseTimeEditText.setInputType(iJ);
                    chooseTimeEditText2.setInputType(iJ);
                    wfbVar = q96VarInflate;
                } else {
                    final o96 o96VarInflate = o96.inflate(LayoutInflater.from(getContext()), this, true);
                    TextInputLayout textInputLayout = o96VarInflate.d;
                    TextInputEditText textInputEditText = o96VarInflate.c;
                    textInputLayout.setId(View.generateViewId());
                    linkedHashMap.put(Integer.valueOf(i3), Integer.valueOf(o96VarInflate.d.getId()));
                    if (!z) {
                        textInputEditText.setText(wn0.e(vn0Var));
                    }
                    if (this.I.containsKey(Integer.valueOf(i3))) {
                        textInputEditText.setText((CharSequence) this.I.get(Integer.valueOf(i3)));
                    }
                    o96VarInflate.b.setText(str != null ? str : i(vn0Var));
                    Resources resources = getResources();
                    String str7 = vn0Var.u;
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String lowerCase = str7.toLowerCase(locale);
                    lowerCase.getClass();
                    textInputEditText.setHint(resources.getString(R.string.benchmark_hint, lowerCase));
                    textInputEditText.setInputType(j(vn0Var));
                    od3.c(textInputEditText, xn0Var.a(), 0, new oh4() { // from class: bp0
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            String string;
                            int i4 = BenchmarksTextSectionLayout.L;
                            int i5 = vn0Var.t;
                            Editable text = o96VarInflate.c.getText();
                            if (text == null || (string = text.toString()) == null) {
                                string = BuildConfig.FLAVOR;
                            }
                            this.t.l(i5, string);
                            return g2b.a;
                        }
                    }, 14);
                    wfbVar2 = o96VarInflate;
                }
                dimension = (int) getResources().getDimension(R.dimen.default_margin);
                if (i == 0) {
                    View root = wfbVar2.getRoot();
                    root.getClass();
                    root.setPadding(dimension, dimension, dimension, dimension);
                } else {
                    View root2 = wfbVar2.getRoot();
                    root2.getClass();
                    root2.setPadding(dimension, root2.getPaddingTop(), dimension, dimension);
                }
                if (!z) {
                    this.I.put(Integer.valueOf(i3), wn0.e(vn0Var));
                }
                i = i2;
            } else {
                final p96 p96VarInflate = p96.inflate(LayoutInflater.from(getContext()), this, true);
                p96VarInflate.d.setId(View.generateViewId());
                linkedHashMap.put(Integer.valueOf(i3), Integer.valueOf(p96VarInflate.d.getId()));
                ChooseTimeEditText chooseTimeEditText3 = p96VarInflate.c;
                chooseTimeEditText3.setCursorVisible(true);
                if (!z) {
                    chooseTimeEditText3.setText(wn0.e(vn0Var));
                }
                if (this.I.containsKey(Integer.valueOf(i3))) {
                    chooseTimeEditText3.setText((CharSequence) this.I.get(Integer.valueOf(i3)));
                }
                p96VarInflate.b.setText(str != null ? str : i(vn0Var));
                su0.c(chooseTimeEditText3, new oh4() { // from class: ap0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        String string;
                        int i4 = BenchmarksTextSectionLayout.L;
                        int i5 = vn0Var.t;
                        Editable text = p96VarInflate.c.getText();
                        if (text == null || (string = text.toString()) == null) {
                            string = BuildConfig.FLAVOR;
                        }
                        this.t.l(i5, string);
                        return g2b.a;
                    }
                });
                wfbVar = p96VarInflate;
            }
            wfbVar2 = wfbVar;
            dimension = (int) getResources().getDimension(R.dimen.default_margin);
            if (i == 0) {
                View root3 = wfbVar2.getRoot();
                root3.getClass();
                root3.setPadding(dimension, dimension, dimension, dimension);
            } else {
                View root4 = wfbVar2.getRoot();
                root4.getClass();
                root4.setPadding(dimension, root4.getPaddingTop(), dimension, dimension);
            }
            if (!z) {
                this.I.put(Integer.valueOf(i3), wn0.e(vn0Var));
            }
            i = i2;
        }
        this.J.setValue(getBenchmarksText());
    }

    public final void l(int i, String str) {
        String string;
        EditText editText;
        Editable text;
        this.I.put(Integer.valueOf(i), str);
        LinkedHashMap linkedHashMap = this.K;
        Iterator it = wx7.a(linkedHashMap.keySet(), Integer.valueOf(i)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(iIntValue));
            if (num != null) {
                int iIntValue2 = num.intValue();
                HashMap map = this.I;
                Integer numValueOf = Integer.valueOf(iIntValue);
                TextInputLayout textInputLayout = (TextInputLayout) findViewById(iIntValue2);
                if (textInputLayout == null || (editText = textInputLayout.getEditText()) == null || (text = editText.getText()) == null || (string = text.toString()) == null) {
                    string = BuildConfig.FLAVOR;
                }
                map.put(numValueOf, string);
            }
        }
        this.J.setValue(getBenchmarksText());
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        this.I = aVar.t;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.t = new HashMap<>();
        aVar.t = new HashMap<>(this.I);
        return aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BenchmarksTextSectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BenchmarksTextSectionLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ BenchmarksTextSectionLayout(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
