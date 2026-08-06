package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.insets.ProtectionLayout;
import androidx.core.view.insets.a;
import androidx.core.view.insets.b;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oa3 extends na3 {
    @Override // defpackage.ma3, defpackage.ka3, defpackage.pa3
    public void b(w7a w7aVar, w7a w7aVar2, Window window, View view, boolean z, boolean z2) {
        x10 anbVar;
        w7aVar.getClass();
        w7aVar2.getClass();
        window.getClass();
        view.getClass();
        int i = 0;
        jmb.a(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int iA = w7aVar.a(z);
        int iA2 = w7aVar2.a(z2);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i2 = 0;
            while (true) {
                if ((i2 < viewGroup.getChildCount() ? 1 : i) == 0) {
                    if (iA != 0 || iA2 != 0) {
                        List listI = ws0.i(new ei1(2, iA), new ei1(1, iA2), new ei1(4, iA2), new ei1(8, iA2));
                        ProtectionLayout protectionLayout = new ProtectionLayout(((ViewGroup) view).getContext(), (List<a>) listI);
                        protectionLayout.setTag(listI);
                        viewGroup.addView(protectionLayout);
                        break;
                    }
                    break;
                }
                int i3 = i2 + 1;
                View childAt = viewGroup.getChildAt(i2);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(i) instanceof ei1)) {
                        for (Object obj : (Iterable) tag) {
                            if ((obj instanceof ei1 ? (ei1) obj : null) != null) {
                                ei1 ei1Var = (ei1) obj;
                                int i4 = ei1Var.a;
                                a.C0012a c0012a = ei1Var.b;
                                ColorDrawable colorDrawable = ei1Var.f;
                                if (i4 == 1) {
                                    ei1Var.g = true;
                                    if (ei1Var.h != iA2) {
                                        ei1Var.h = iA2;
                                        colorDrawable.setColor(iA2);
                                        c0012a.e = colorDrawable;
                                        a.C0012a.InterfaceC0013a interfaceC0013a = c0012a.i;
                                        if (interfaceC0013a != null) {
                                            ((b) interfaceC0013a).b.setBackground(colorDrawable);
                                        }
                                    }
                                } else if (i4 == 2) {
                                    ei1Var.g = true;
                                    if (ei1Var.h != iA) {
                                        ei1Var.h = iA;
                                        colorDrawable.setColor(iA);
                                        c0012a.e = colorDrawable;
                                        a.C0012a.InterfaceC0013a interfaceC0013a2 = c0012a.i;
                                        if (interfaceC0013a2 != null) {
                                            ((b) interfaceC0013a2).b.setBackground(colorDrawable);
                                        }
                                    }
                                } else if (i4 == 4) {
                                    ei1Var.g = true;
                                    if (ei1Var.h != iA2) {
                                        ei1Var.h = iA2;
                                        colorDrawable.setColor(iA2);
                                        c0012a.e = colorDrawable;
                                        a.C0012a.InterfaceC0013a interfaceC0013a3 = c0012a.i;
                                        if (interfaceC0013a3 != null) {
                                            ((b) interfaceC0013a3).b.setBackground(colorDrawable);
                                        }
                                    }
                                } else if (i4 == 8) {
                                    ei1Var.g = true;
                                    if (ei1Var.h != iA2) {
                                        ei1Var.h = iA2;
                                        colorDrawable.setColor(iA2);
                                        c0012a.e = colorDrawable;
                                        a.C0012a.InterfaceC0013a interfaceC0013a4 = c0012a.i;
                                        if (interfaceC0013a4 != null) {
                                            ((b) interfaceC0013a4).b.setBackground(colorDrawable);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
                i2 = i3;
                i = 0;
            }
        }
        window.setNavigationBarContrastEnforced(w7aVar2.c == 0);
        yv9 yv9Var = new yv9(view);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            anbVar = new dnb(window, yv9Var);
        } else if (i5 >= 30) {
            anbVar = new bnb(window, yv9Var);
        } else {
            anbVar = i5 >= 26 ? new anb(window, yv9Var) : new zmb(window, yv9Var);
        }
        anbVar.h(!z);
        anbVar.g(!z2);
    }
}
