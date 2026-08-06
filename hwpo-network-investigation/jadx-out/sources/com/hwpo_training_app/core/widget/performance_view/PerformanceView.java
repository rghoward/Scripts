package com.hwpo_training_app.core.widget.performance_view;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.layout_manager.HorizontalRatioLayoutManager;
import com.hwpo_training_app.core.widget.layout_manager.SquareRatioLayoutManager;
import com.hwpo_training_app.core.widget.performance_view.PerformanceView;
import defpackage.ac4;
import defpackage.aj4;
import defpackage.bw7;
import defpackage.cs2;
import defpackage.dd8;
import defpackage.f15;
import defpackage.g2b;
import defpackage.gs5;
import defpackage.jw3;
import defpackage.k55;
import defpackage.l89;
import defpackage.mh4;
import defpackage.o7a;
import defpackage.oh4;
import defpackage.qq2;
import defpackage.u;
import defpackage.u59;
import defpackage.ws0;
import defpackage.xgb;
import defpackage.xj5;
import defpackage.xv7;
import defpackage.xx4;
import defpackage.xy3;
import defpackage.zc8;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class PerformanceView extends xx4 {
    public static final a Companion = new a();
    public final o7a A;
    public k55 v;
    public xy3 w;
    public oh4<? super l89, g2b> x;
    public final gs5 y;
    public final o7a z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        int i2 = 1;
        if (!isInEditMode() && !this.u) {
            this.u = true;
            ((bw7) a()).a(this);
        }
        gs5 gs5VarInflate = gs5.inflate(LayoutInflater.from(getContext()), this);
        gs5VarInflate.getClass();
        RecyclerView recyclerView = gs5VarInflate.c;
        this.y = gs5VarInflate;
        this.z = new o7a(new aj4(i2, this));
        this.A = new o7a(new mh4() { // from class: yv7
            @Override // defpackage.mh4
            public final Object invoke() {
                PerformanceView.a aVar = PerformanceView.Companion;
                final Context context2 = context;
                final PerformanceView performanceView = this;
                return new jw3(new oh4() { // from class: aw7
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        l89 l89Var = (l89) obj;
                        PerformanceView.a aVar2 = PerformanceView.Companion;
                        l89Var.getClass();
                        s60 s60Var = l89Var.D;
                        s60 s60Var2 = s60.u;
                        PerformanceView performanceView2 = performanceView;
                        if (s60Var == s60Var2) {
                            File file = new File(performanceView2.getFilesManager().b(), l89Var.H);
                            String str = l89Var.z;
                            performanceView2.getBuildConfig().getClass();
                            str.getClass();
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setFlags(1);
                            String strConcat = "com.hwpo_training_app".concat(".fileprovider");
                            Context context3 = context2;
                            intent.setDataAndType(FileProvider.getUriForFile(context3, strConcat, file), str);
                            try {
                                context3.startActivity(intent);
                            } catch (ActivityNotFoundException unused) {
                                PerformanceView.a aVar3 = PerformanceView.Companion;
                                Toast.makeText(context3, performanceView2.getResources().getString(R.string.file_can_not_be_open), 0).show();
                                g2b g2bVar = g2b.a;
                            }
                        } else {
                            oh4<? super l89, g2b> oh4Var = performanceView2.x;
                            if (oh4Var != null) {
                                oh4Var.invoke(l89Var);
                            }
                        }
                        return g2b.a;
                    }
                }, R.color.performanceAttachmentsBackground);
            }
        });
        setOrientation(1);
        cs2 cs2Var = new cs2();
        int dimension = (int) getResources().getDimension(R.dimen.default_margin);
        f15 f15Var = new f15(dimension, dimension);
        recyclerView.setLayoutManager(new SquareRatioLayoutManager(context));
        cs2Var.a(recyclerView);
        recyclerView.h(f15Var);
        recyclerView.setAdapter(getMediaAttachmentsAdapter());
        RecyclerView recyclerView2 = gs5VarInflate.b;
        recyclerView2.setLayoutManager(new HorizontalRatioLayoutManager(context));
        cs2Var.a(recyclerView);
        recyclerView2.h(f15Var);
        recyclerView2.setAdapter(getFileAttachmentsAdapter());
    }

    private final jw3 getFileAttachmentsAdapter() {
        return (jw3) this.A.getValue();
    }

    private final xv7 getMediaAttachmentsAdapter() {
        return (xv7) this.z.getValue();
    }

    public final String b(long j) {
        long j2 = j / 3600;
        long seconds = j - TimeUnit.HOURS.toSeconds(j2);
        long j3 = seconds / 60;
        long seconds2 = seconds - TimeUnit.MINUTES.toSeconds(j3);
        String str = String.format("%01d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
        String str2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1));
        String str3 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds2)}, 1));
        if (j2 > 0 && j3 > 0) {
            String string = getResources().getString(R.string.score_time_h_m_s, str, str2, str3);
            string.getClass();
            return string;
        }
        if (j2 > 0) {
            String string2 = getResources().getString(R.string.score_time_h_s, str, str3);
            string2.getClass();
            return string2;
        }
        if (j3 > 0) {
            String string3 = getResources().getString(R.string.score_time_m_s, str2, str3);
            string3.getClass();
            return string3;
        }
        String string4 = getResources().getString(R.string.score_time_s, str3);
        string4.getClass();
        return string4;
    }

    public final void c(List<l89> list) {
        list.getClass();
        getFileAttachmentsAdapter().u(list);
    }

    public final void d(List<l89> list) {
        list.getClass();
        getMediaAttachmentsAdapter().u(list);
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
    public final void e(List<String> list) {
        list.getClass();
        LinearLayoutCompat linearLayoutCompat = this.y.f;
        linearLayoutCompat.removeAllViews();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ws0.m();
                throw null;
            }
            TextView textView = (TextView) xgb.e(linearLayoutCompat, R.layout.layout_score_description);
            textView.setText((String) obj);
            if (i != 0) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    ac4.c("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = (int) linearLayoutCompat.getResources().getDimension(R.dimen.score_description_text_margin);
                    textView.setLayoutParams(marginLayoutParams);
                }
            }
            linearLayoutCompat.addView(textView);
            i = i2;
        }
    }

    public final void f(zc8 zc8Var) {
        zc8Var.getClass();
        String str = zc8Var.D;
        u59 u59Var = zc8Var.u;
        int i = zc8Var.v;
        gs5 gs5Var = this.y;
        MaterialTextView materialTextView = gs5Var.d;
        LinearLayoutCompat linearLayoutCompat = gs5Var.g;
        materialTextView.setVisibility(0);
        MaterialTextView materialTextView2 = gs5Var.d;
        dd8 dd8Var = zc8Var.z;
        boolean z = dd8Var.A;
        int i2 = dd8Var.y;
        int i3 = dd8Var.x;
        double d = dd8Var.u;
        List<dd8> list = dd8Var.w;
        materialTextView2.setText(z ? R.string.my_result_scaled : R.string.my_result);
        int iOrdinal = zc8Var.C.ordinal();
        int i4 = R.layout.layout_multiply_score;
        switch (iOrdinal) {
            case 0:
                linearLayoutCompat.removeAllViews();
                TextView textView = (TextView) xgb.e(linearLayoutCompat, R.layout.layout_simple_score);
                textView.setText(getResources().getString(R.string.value_with_measure_no_parentheses, u59Var.a() ? String.valueOf(d) : String.valueOf((int) d), str));
                linearLayoutCompat.addView(textView);
                break;
            case 1:
                linearLayoutCompat.removeAllViews();
                TextView textView2 = (TextView) xgb.e(linearLayoutCompat, R.layout.layout_simple_score);
                textView2.setText(b((long) d));
                linearLayoutCompat.addView(textView2);
                break;
            case 2:
                linearLayoutCompat.removeAllViews();
                TextView textView3 = (TextView) xgb.e(linearLayoutCompat, R.layout.layout_simple_score);
                String strB = b((long) d);
                if (i3 == -1 && i2 == -1) {
                    textView3.setText(strB);
                } else if (i3 == 0) {
                    textView3.setText(getResources().getString(R.string.missed_time_cap_without_rounds_value, Integer.valueOf(i2), strB));
                } else {
                    textView3.setText(getResources().getString(R.string.missed_time_cap_value, Integer.valueOf(i3), Integer.valueOf(i2), strB));
                }
                linearLayoutCompat.addView(textView3);
                break;
            case 3:
                linearLayoutCompat.removeAllViews();
                TextView textView4 = (TextView) xgb.e(linearLayoutCompat, R.layout.layout_simple_score);
                textView4.setText(getResources().getString(R.string.round_reps_value, Integer.valueOf((i * i3) + i2), Integer.valueOf(i3), Integer.valueOf(i2)));
                linearLayoutCompat.addView(textView4);
                break;
            case 4:
                linearLayoutCompat.removeAllViews();
                for (dd8 dd8Var2 : list) {
                    View viewE = xgb.e(linearLayoutCompat, i4);
                    TextView textView5 = (TextView) viewE.findViewById(R.id.scoreValueText);
                    TextView textView6 = (TextView) viewE.findViewById(R.id.scorePositionText);
                    double d2 = dd8Var2.u;
                    int i5 = dd8Var2.z;
                    String string = d2 == -1.0d ? getResources().getString(R.string.empty_value) : u59Var.a() ? getResources().getString(R.string.value_with_measure_no_parentheses, String.valueOf(d2), str) : getResources().getString(R.string.value_with_measure_no_parentheses, String.valueOf((int) d2), str);
                    string.getClass();
                    textView5.setText(string);
                    textView6.setText(getResources().getString(R.string.score_value_position, Integer.valueOf(i5)));
                    if (i5 != 0) {
                        xgb.h((int) linearLayoutCompat.getResources().getDimension(R.dimen.score_description_text_margin), viewE);
                    }
                    linearLayoutCompat.addView(viewE);
                    i4 = R.layout.layout_multiply_score;
                }
                break;
            case 5:
                linearLayoutCompat.removeAllViews();
                for (dd8 dd8Var3 : list) {
                    View viewE2 = xgb.e(linearLayoutCompat, R.layout.layout_multiply_score);
                    TextView textView7 = (TextView) viewE2.findViewById(R.id.scoreValueText);
                    TextView textView8 = (TextView) viewE2.findViewById(R.id.scorePositionText);
                    double d3 = dd8Var3.u;
                    int i6 = dd8Var3.z;
                    String string2 = d3 == -1.0d ? getResources().getString(R.string.empty_value) : b((long) d3);
                    string2.getClass();
                    textView7.setText(string2);
                    textView8.setText(getResources().getString(R.string.score_value_position, Integer.valueOf(i6)));
                    if (i6 != 0) {
                        xgb.h((int) linearLayoutCompat.getResources().getDimension(R.dimen.score_description_text_margin), viewE2);
                    }
                    linearLayoutCompat.addView(viewE2);
                }
                break;
            case 6:
                linearLayoutCompat.removeAllViews();
                for (dd8 dd8Var4 : list) {
                    View viewE3 = xgb.e(linearLayoutCompat, R.layout.layout_multiply_score);
                    TextView textView9 = (TextView) viewE3.findViewById(R.id.scoreValueText);
                    TextView textView10 = (TextView) viewE3.findViewById(R.id.scorePositionText);
                    int i7 = dd8Var4.x;
                    int i8 = dd8Var4.z;
                    int i9 = dd8Var4.y;
                    String string3 = (i7 == -1 || i9 == -1) ? getResources().getString(R.string.empty_value) : getResources().getString(R.string.round_reps_value, Integer.valueOf((i7 * i) + i9), Integer.valueOf(dd8Var4.x), Integer.valueOf(i9));
                    string3.getClass();
                    textView9.setText(string3);
                    textView10.setText(getResources().getString(R.string.score_value_position, Integer.valueOf(i8)));
                    if (i8 != 0) {
                        xgb.h((int) linearLayoutCompat.getResources().getDimension(R.dimen.score_description_text_margin), viewE3);
                    }
                    linearLayoutCompat.addView(viewE3);
                }
                break;
            default:
                u.b();
                return;
        }
        linearLayoutCompat.setVisibility(0);
    }

    public final k55 getBuildConfig() {
        k55 k55Var = this.v;
        if (k55Var != null) {
            return k55Var;
        }
        xj5.e("buildConfig");
        throw null;
    }

    public final xy3 getFilesManager() {
        xy3 xy3Var = this.w;
        if (xy3Var != null) {
            return xy3Var;
        }
        xj5.e("filesManager");
        throw null;
    }

    public final oh4<l89, g2b> getOnAttachmentClick() {
        return this.x;
    }

    public final void setBuildConfig(k55 k55Var) {
        k55Var.getClass();
        this.v = k55Var;
    }

    public final void setFilesManager(xy3 xy3Var) {
        xy3Var.getClass();
        this.w = xy3Var;
    }

    public final void setOnAttachmentClick(oh4<? super l89, g2b> oh4Var) {
        this.x = oh4Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PerformanceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ PerformanceView(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PerformanceView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
