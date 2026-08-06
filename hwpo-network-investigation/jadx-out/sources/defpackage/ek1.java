package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.AspectRatioFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ek1 {
    public static final e93 a(final boolean z, final int i, final oh4 oh4Var, final oh4 oh4Var2, final ci4 ci4Var, final ci4 ci4Var2, final ci4 ci4Var3, oh4 oh4Var3) {
        return new e93(new uj1(), new vj1(0, oh4Var3), new oh4() { // from class: wj1
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                int i2 = 0;
                final xj1 xj1Var = new xj1(ci4Var, yaVar, 0);
                final yj1 yj1Var = new yj1(i2, ci4Var2, yaVar);
                final zj1 zj1Var = new zj1(i2, ci4Var3, yaVar);
                um6.a aVar = new um6.a();
                fv3 fv3Var = new fv3();
                final oh4 oh4Var4 = oh4Var2;
                final um6 um6Var = new um6(aVar, new e93(fv3Var, new tv3(3), new oh4() { // from class: iv3
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        final ya yaVar2 = (ya) obj2;
                        yaVar2.getClass();
                        ((ea6) yaVar2.u).a.setOnLongClickListener(new lv3());
                        final oh4 oh4Var5 = oh4Var4;
                        final zj1 zj1Var2 = zj1Var;
                        final yj1 yj1Var2 = yj1Var;
                        yaVar2.s(new oh4() { // from class: ov3
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj3) {
                                int i3;
                                ((List) obj3).getClass();
                                ya yaVar3 = yaVar2;
                                ea6 ea6Var = (ea6) yaVar3.u;
                                s60 s60Var = ((w60.a) yaVar3.t()).j;
                                int iOrdinal = s60Var.ordinal();
                                if (iOrdinal == 0) {
                                    ea6Var.b.setImageResource(R.drawable.ic_file_download);
                                } else if (iOrdinal == 1) {
                                    ea6Var.b.setImageResource(R.drawable.ic_file_loaded);
                                } else if (iOrdinal == 2) {
                                    ea6Var.b.setImageResource(R.drawable.ic_file_retry);
                                    ea6Var.c.setImageDrawable(null);
                                } else {
                                    if (iOrdinal != 3) {
                                        u.b();
                                        return null;
                                    }
                                    ea6Var.b.setImageResource(R.drawable.ic_file_loading);
                                    Object drawable = ea6Var.b.getDrawable();
                                    drawable.getClass();
                                    ((Animatable) drawable).start();
                                    ea6Var.c.setImageResource(R.drawable.ic_loading_stop);
                                }
                                ea6Var.c.setVisibility((s60Var == s60.w || s60Var == s60.v) ? 0 : 4);
                                ea6 ea6Var2 = (ea6) yaVar3.u;
                                xc9 xc9Var = ((w60.a) yaVar3.t()).k;
                                ea6Var2.getClass();
                                AppCompatImageView appCompatImageView = ea6Var2.f;
                                int iOrdinal2 = xc9Var.ordinal();
                                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                                    i3 = R.drawable.ic_attachment_uploading;
                                } else {
                                    if (iOrdinal2 != 2) {
                                        u.b();
                                        return null;
                                    }
                                    i3 = R.drawable.ic_delete_media_attachment;
                                }
                                appCompatImageView.setImageResource(i3);
                                Object drawable2 = appCompatImageView.getDrawable();
                                Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
                                if (animatable != null) {
                                    animatable.start();
                                }
                                ea6Var2.h.setImageResource(w6b.a[xc9Var.ordinal()] == 3 ? R.drawable.ic_uploading_retry : R.drawable.ic_uploading_cancel);
                                Group group = ea6Var2.g;
                                xc9 xc9Var2 = xc9.u;
                                group.setVisibility(xc9Var != xc9Var2 ? 0 : 8);
                                appCompatImageView.setVisibility(xc9Var == xc9Var2 ? 8 : 0);
                                ea6Var.e.setText(((w60.a) yaVar3.t()).c);
                                ea6Var.d.setText(((w60.a) yaVar3.t()).d);
                                ea6Var.j.setText(((w60.a) yaVar3.t()).e);
                                FrameLayout frameLayout = ea6Var.a;
                                frameLayout.getClass();
                                xgb.a(frameLayout, new xv3(oh4Var5, yaVar3, null));
                                ImageButton imageButton = ea6Var.h;
                                zj1 zj1Var3 = zj1Var2;
                                xgb.a(imageButton, new yv3(yaVar3, zj1Var3, yj1Var2, null));
                                xgb.a(ea6Var.f, new zv3(yaVar3, zj1Var3, null));
                                return g2b.a;
                            }
                        });
                        return g2b.a;
                    }
                }, vv3.u), new e93(new yl6(), new lm6(3), new oh4() { // from class: bm6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        final ya yaVar2 = (ya) obj2;
                        yaVar2.getClass();
                        ((fa6) yaVar2.u).a.setOnLongClickListener(new em6());
                        final zj1 zj1Var2 = zj1Var;
                        final yj1 yj1Var2 = yj1Var;
                        final xj1 xj1Var2 = xj1Var;
                        yaVar2.s(new oh4() { // from class: hm6
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj3) {
                                int i3;
                                ((List) obj3).getClass();
                                ya yaVar3 = yaVar2;
                                fa6 fa6Var = (fa6) yaVar3.u;
                                AppCompatImageView appCompatImageView = fa6Var.d;
                                AppCompatImageView appCompatImageView2 = fa6Var.e;
                                AppCompatImageView appCompatImageView3 = fa6Var.b;
                                xgb.f(appCompatImageView, ((w60.b) yaVar3.t()).d, new bi9(1));
                                fa6Var.c.setVisibility(((w60.b) yaVar3.t()).c == u60.u || ((w60.b) yaVar3.t()).c == u60.t ? 0 : 8);
                                xc9 xc9Var = ((w60.b) yaVar3.t()).i;
                                xc9 xc9Var2 = xc9.u;
                                appCompatImageView2.setVisibility(xc9Var != xc9Var2 ? 0 : 8);
                                appCompatImageView2.setImageResource(w6b.a[((w60.b) yaVar3.t()).i.ordinal()] == 3 ? R.drawable.ic_uploading_retry : R.drawable.ic_uploading_cancel);
                                zj1 zj1Var3 = zj1Var2;
                                xgb.a(appCompatImageView2, new nm6(yaVar3, zj1Var3, yj1Var2, null));
                                appCompatImageView3.setVisibility(((w60.b) yaVar3.t()).i == xc9Var2 ? 8 : 0);
                                int iOrdinal = ((w60.b) yaVar3.t()).i.ordinal();
                                if (iOrdinal == 0 || iOrdinal == 1) {
                                    i3 = R.drawable.ic_attachment_uploading;
                                } else {
                                    if (iOrdinal != 2) {
                                        u.b();
                                        return null;
                                    }
                                    i3 = R.drawable.ic_delete_media_attachment;
                                }
                                appCompatImageView3.setImageResource(i3);
                                Object drawable = appCompatImageView3.getDrawable();
                                Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
                                if (animatable != null) {
                                    animatable.start();
                                }
                                xgb.a(appCompatImageView3, new om6(yaVar3, zj1Var3, null));
                                AspectRatioFrameLayout aspectRatioFrameLayout = fa6Var.a;
                                aspectRatioFrameLayout.getClass();
                                xgb.a(aspectRatioFrameLayout, new pm6(xj1Var2, yaVar3, null));
                                return g2b.a;
                            }
                        });
                        return g2b.a;
                    }
                }, mm6.u));
                Context context = yaVar.w;
                tt6 tt6Var = new tt6((int) context.getResources().getDimension(R.dimen.message_files_margin));
                int i3 = i;
                GridLayoutManager gridLayoutManager = new GridLayoutManager(context, i3);
                dk1 dk1Var = new dk1(um6Var, i3);
                gridLayoutManager.K = dk1Var;
                dk1Var.c = true;
                RecyclerView recyclerView = ((n96) yaVar.u).c;
                recyclerView.setLayoutManager(gridLayoutManager);
                recyclerView.h(tt6Var);
                recyclerView.setAdapter(um6Var);
                recyclerView.setItemAnimator(null);
                final boolean z2 = z;
                final oh4 oh4Var5 = oh4Var;
                yaVar.s(new oh4() { // from class: ak1
                    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
                    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
                    /* JADX WARN: Code duplicated, block: B:75:0x0099 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:76:0x0097 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:77:? A[LOOP:3: B:26:0x0089->B:77:?, LOOP_END, SYNTHETIC] */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        boolean z3;
                        int size;
                        int i4;
                        Object obj3;
                        ((List) obj2).getClass();
                        ya yaVar2 = yaVar;
                        n96 n96Var = (n96) yaVar2.u;
                        um6Var.u(((sk1.a) yaVar2.t()).k);
                        List<w60> list = ((sk1.a) yaVar2.t()).k;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof w60.a) {
                                arrayList.add(obj4);
                            }
                        }
                        List<w60> list2 = ((sk1.a) yaVar2.t()).k;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : list2) {
                            if (obj5 instanceof w60.b) {
                                arrayList2.add(obj5);
                            }
                        }
                        boolean zIsEmpty = arrayList.isEmpty();
                        xc9 xc9Var = xc9.u;
                        int i5 = 1;
                        if (zIsEmpty) {
                            if (!arrayList2.isEmpty()) {
                                size = arrayList2.size();
                                i4 = 0;
                                while (true) {
                                    if (i4 < size) {
                                        obj3 = arrayList2.get(i4);
                                        i4++;
                                        if (((w60.b) obj3).i != xc9Var) {
                                            z3 = false;
                                        }
                                    }
                                }
                            }
                            z3 = true;
                        } else {
                            int size2 = arrayList.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 < size2) {
                                    Object obj6 = arrayList.get(i6);
                                    i6++;
                                    if (((w60.a) obj6).k != xc9Var) {
                                    }
                                } else {
                                    if (!arrayList2.isEmpty()) {
                                        size = arrayList2.size();
                                        i4 = 0;
                                        while (true) {
                                            if (i4 < size) {
                                                obj3 = arrayList2.get(i4);
                                                i4++;
                                                if (((w60.b) obj3).i != xc9Var) {
                                                }
                                            }
                                        }
                                    }
                                    z3 = true;
                                }
                                z3 = false;
                            }
                        }
                        AppCompatImageView appCompatImageView = n96Var.b;
                        ShapeableImageView shapeableImageView = n96Var.e;
                        MaterialTextView materialTextView = n96Var.h;
                        MaterialTextView materialTextView2 = n96Var.g;
                        appCompatImageView.setVisibility((z2 && z3) ? 0 : 8);
                        xgb.a(n96Var.b, new ck1(oh4Var5, yaVar2, null));
                        n96Var.d.setText(((sk1.a) yaVar2.t()).g);
                        materialTextView2.setText(((sk1.a) yaVar2.t()).j);
                        materialTextView2.setVisibility(!z2a.w(((sk1.a) yaVar2.t()).j) ? 0 : 8);
                        materialTextView.setText(String.valueOf(a3a.S(((sk1.a) yaVar2.t()).g)));
                        n96Var.f.setText(((sk1.a) yaVar2.t()).f);
                        String str = ((sk1.a) yaVar2.t()).h;
                        boolean z4 = str == null || z2a.w(str);
                        shapeableImageView.setVisibility(!z4 ? 0 : 8);
                        materialTextView.setVisibility(z4 ? 0 : 8);
                        if (str != null && !z2a.w(str)) {
                            xgb.f(shapeableImageView, str, new bi9(i5));
                        }
                        return g2b.a;
                    }
                });
                return g2b.a;
            }
        }, bk1.u);
    }
}
