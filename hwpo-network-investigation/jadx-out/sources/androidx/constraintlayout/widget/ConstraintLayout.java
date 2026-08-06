package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bmb;
import defpackage.dmb;
import defpackage.dw4;
import defpackage.ey2;
import defpackage.f61;
import defpackage.h4c;
import defpackage.hh8;
import defpackage.j86;
import defpackage.jjb;
import defpackage.kjb;
import defpackage.lk7;
import defpackage.ll0;
import defpackage.meb;
import defpackage.o15;
import defpackage.rj0;
import defpackage.rm9;
import defpackage.sx1;
import defpackage.tx1;
import defpackage.vp4;
import defpackage.vx1;
import defpackage.wp4;
import defpackage.wx1;
import defpackage.yx1;
import defpackage.z97;
import io.ably.lib.transport.Defaults;
import io.ably.lib.util.AgentHeaderCreator;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static rm9 I;
    public boolean A;
    public int B;
    public c C;
    public tx1 D;
    public int E;
    public HashMap<String, Integer> F;
    public final SparseArray<vx1> G;
    public final b H;
    public final SparseArray<View> t;
    public final ArrayList<androidx.constraintlayout.widget.b> u;
    public final wx1 v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements ll0.b {
        public final ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public b(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        public static boolean a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        public final void b(vx1 vx1Var, ll0.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iMax;
            int iMax2;
            boolean z;
            int baseline;
            int i;
            sx1 sx1Var = vx1Var.L;
            sx1 sx1Var2 = vx1Var.J;
            if (vx1Var.i0 == 8 && !vx1Var.F) {
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
                return;
            }
            if (vx1Var.V == null) {
                return;
            }
            rm9 rm9Var = ConstraintLayout.I;
            vx1.a aVar2 = aVar.a;
            vx1.a aVar3 = aVar.b;
            int i2 = aVar.c;
            int i3 = aVar.d;
            int i4 = this.b + this.c;
            int i5 = this.d;
            View view = vx1Var.h0;
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            } else if (iOrdinal == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
            } else if (iOrdinal == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
                boolean z2 = vx1Var.r == 1;
                int i6 = aVar.j;
                if (i6 == 1 || i6 == 2) {
                    boolean z3 = view.getMeasuredHeight() == vx1Var.i();
                    if (aVar.j == 2 || !z2 || ((z2 && z3) || (view instanceof Placeholder) || vx1Var.y())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(vx1Var.o(), 1073741824);
                    }
                }
            } else if (iOrdinal != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i7 = this.f;
                int i8 = sx1Var2 != null ? sx1Var2.g : 0;
                if (sx1Var != null) {
                    i8 += sx1Var.g;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i5 + i8, -1);
            }
            int iOrdinal2 = aVar3.ordinal();
            if (iOrdinal2 == 0) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (iOrdinal2 == 1) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
            } else if (iOrdinal2 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
                boolean z4 = vx1Var.s == 1;
                int i9 = aVar.j;
                if (i9 == 1 || i9 == 2) {
                    boolean z5 = view.getMeasuredWidth() == vx1Var.o();
                    if (aVar.j == 2 || !z4 || ((z4 && z5) || (view instanceof Placeholder) || vx1Var.z())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(vx1Var.i(), 1073741824);
                    }
                }
            } else if (iOrdinal2 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i10 = this.g;
                int i11 = sx1Var2 != null ? vx1Var.K.g : 0;
                if (sx1Var != null) {
                    i11 += vx1Var.M.g;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, i4 + i11, -1);
            }
            wx1 wx1Var = (wx1) vx1Var.V;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (wx1Var != null && lk7.b(constraintLayout.B, 256) && view.getMeasuredWidth() == vx1Var.o() && view.getMeasuredWidth() < wx1Var.o() && view.getMeasuredHeight() == vx1Var.i() && view.getMeasuredHeight() < wx1Var.i() && view.getBaseline() == vx1Var.c0 && !vx1Var.x() && a(vx1Var.H, iMakeMeasureSpec, vx1Var.o()) && a(vx1Var.I, iMakeMeasureSpec2, vx1Var.i())) {
                aVar.e = vx1Var.o();
                aVar.f = vx1Var.i();
                aVar.g = vx1Var.c0;
                return;
            }
            vx1.a aVar4 = vx1.a.v;
            boolean z6 = aVar2 == aVar4;
            boolean z7 = aVar3 == aVar4;
            vx1.a aVar5 = vx1.a.t;
            vx1.a aVar6 = vx1.a.w;
            boolean z8 = aVar3 == aVar6 || aVar3 == aVar5;
            boolean z9 = aVar2 == aVar6 || aVar2 == aVar5;
            boolean z10 = z6 && vx1Var.Y > 0.0f;
            boolean z11 = z7 && vx1Var.Y > 0.0f;
            if (view == null) {
                return;
            }
            a aVar7 = (a) view.getLayoutParams();
            int i12 = aVar.j;
            if (i12 != 1 && i12 != 2 && z6 && vx1Var.r == 0 && z7 && vx1Var.s == 0) {
                i = -1;
                z = false;
                baseline = 0;
                iMax = 0;
                iMax2 = 0;
            } else {
                if (!(view instanceof jjb) || !(vx1Var instanceof kjb)) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                vx1Var.H = iMakeMeasureSpec;
                vx1Var.I = iMakeMeasureSpec2;
                vx1Var.g = false;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i13 = vx1Var.u;
                iMax = i13 > 0 ? Math.max(i13, measuredWidth) : measuredWidth;
                int i14 = vx1Var.v;
                if (i14 > 0) {
                    iMax = Math.min(i14, iMax);
                }
                int i15 = vx1Var.x;
                iMax2 = i15 > 0 ? Math.max(i15, measuredHeight) : measuredHeight;
                int i16 = iMakeMeasureSpec2;
                int i17 = vx1Var.y;
                if (i17 > 0) {
                    iMax2 = Math.min(i17, iMax2);
                }
                if (!lk7.b(constraintLayout.B, 1)) {
                    if (z10 && z8) {
                        iMax = (int) ((iMax2 * vx1Var.Y) + 0.5f);
                    } else if (z11 && z9) {
                        iMax2 = (int) ((iMax / vx1Var.Y) + 0.5f);
                    }
                }
                if (measuredWidth == iMax && measuredHeight == iMax2) {
                    baseline = baseline2;
                    i = -1;
                    z = false;
                } else {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i16;
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    vx1Var.H = iMakeMeasureSpec;
                    vx1Var.I = iMakeMeasureSpec3;
                    z = false;
                    vx1Var.g = false;
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMax = measuredWidth2;
                    iMax2 = measuredHeight2;
                    i = -1;
                }
            }
            boolean z12 = baseline != i ? true : z;
            aVar.i = (iMax == aVar.c && iMax2 == aVar.d) ? z : true;
            boolean z13 = aVar7.c0 ? true : z12;
            if (z13 && baseline != -1 && vx1Var.c0 != baseline) {
                aVar.i = true;
            }
            aVar.e = iMax;
            aVar.f = iMax2;
            aVar.h = z13;
            aVar.g = baseline;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.t = new SparseArray<>();
        this.u = new ArrayList<>(4);
        this.v = new wx1();
        this.w = 0;
        this.x = 0;
        this.y = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.A = true;
        this.B = 257;
        this.C = null;
        this.D = null;
        this.E = -1;
        this.F = new HashMap<>();
        this.G = new SparseArray<>();
        this.H = new b(this);
        b(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static rm9 getSharedValues() {
        if (I == null) {
            rm9 rm9Var = new rm9();
            new SparseIntArray();
            new HashMap();
            I = rm9Var;
        }
        return I;
    }

    public final vx1 a(View view) {
        if (view == this) {
            return this.v;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).q0;
        }
        view.setLayoutParams(new a(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).q0;
        }
        return null;
    }

    public final void b(AttributeSet attributeSet, int i, int i2) {
        wx1 wx1Var = this.v;
        wx1Var.h0 = this;
        b bVar = this.H;
        wx1Var.v0 = bVar;
        wx1Var.t0.f = bVar;
        this.t.put(getId(), this);
        this.C = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, hh8.b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.w);
                } else if (index == 17) {
                    this.x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.x);
                } else if (index == 14) {
                    this.y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.y);
                } else if (index == 15) {
                    this.z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.z);
                } else if (index == 113) {
                    this.B = typedArrayObtainStyledAttributes.getInt(index, this.B);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.D = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar = new c();
                        this.C = cVar;
                        cVar.g(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.C = null;
                    }
                    this.E = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        wx1Var.E0 = this.B;
        j86.q = wx1Var.S(512);
    }

    public final boolean c() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void d(int i) {
        this.D = new tx1(getContext(), this, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.u;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                arrayList.get(i).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:114:0x0209  */
    /* JADX WARN: Code duplicated, block: B:115:0x020c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0210  */
    /* JADX WARN: Code duplicated, block: B:119:0x0216  */
    /* JADX WARN: Code duplicated, block: B:122:0x021f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:199:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:201:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:203:0x03e9 A[LOOP:11: B:202:0x03e7->B:203:0x03e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:205:0x0436  */
    /* JADX WARN: Code duplicated, block: B:208:0x0452  */
    /* JADX WARN: Code duplicated, block: B:209:0x0459  */
    /* JADX WARN: Code duplicated, block: B:211:0x045d  */
    /* JADX WARN: Code duplicated, block: B:213:0x0467 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x0469  */
    /* JADX WARN: Code duplicated, block: B:215:0x046b  */
    /* JADX WARN: Code duplicated, block: B:217:0x046e  */
    /* JADX WARN: Code duplicated, block: B:218:0x0470  */
    /* JADX WARN: Code duplicated, block: B:220:0x0475  */
    /* JADX WARN: Code duplicated, block: B:222:0x0485  */
    /* JADX WARN: Code duplicated, block: B:228:0x048e  */
    /* JADX WARN: Code duplicated, block: B:230:0x049f  */
    /* JADX WARN: Code duplicated, block: B:233:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:251:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:257:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:259:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:264:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:271:0x0506  */
    /* JADX WARN: Code duplicated, block: B:278:0x0515 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:279:0x0517  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:284:0x0521  */
    /* JADX WARN: Code duplicated, block: B:288:0x0536  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:290:0x053e  */
    /* JADX WARN: Code duplicated, block: B:293:0x0545  */
    /* JADX WARN: Code duplicated, block: B:295:0x0560  */
    /* JADX WARN: Code duplicated, block: B:298:0x0571  */
    /* JADX WARN: Code duplicated, block: B:303:0x0589  */
    /* JADX WARN: Code duplicated, block: B:305:0x058c A[LOOP:5: B:304:0x058a->B:305:0x058c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:308:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:310:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:312:0x05af  */
    /* JADX WARN: Code duplicated, block: B:314:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:317:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:318:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:322:0x05da  */
    /* JADX WARN: Code duplicated, block: B:324:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:325:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:327:0x0619  */
    /* JADX WARN: Code duplicated, block: B:329:0x061e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:333:0x063d  */
    /* JADX WARN: Code duplicated, block: B:335:0x0641  */
    /* JADX WARN: Code duplicated, block: B:337:0x0646  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:346:0x0684  */
    /* JADX WARN: Code duplicated, block: B:348:0x0687  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:350:0x0691  */
    /* JADX WARN: Code duplicated, block: B:354:0x0699  */
    /* JADX WARN: Code duplicated, block: B:360:0x06a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:368:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:371:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:374:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:376:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:380:0x070e  */
    /* JADX WARN: Code duplicated, block: B:382:0x0712  */
    /* JADX WARN: Code duplicated, block: B:384:0x0717  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:390:0x0739  */
    /* JADX WARN: Code duplicated, block: B:393:0x0740  */
    /* JADX WARN: Code duplicated, block: B:397:0x0751 A[LOOP:7: B:344:0x0681->B:397:0x0751, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:399:0x075f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:402:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x0525 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:430:0x0525 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0580 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x0580 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x0674 A[EDGE_INSN: B:436:0x0674->B:343:0x0674 BREAK  A[LOOP:6: B:320:0x05d4->B:342:0x0665], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x075c A[EDGE_INSN: B:439:0x075c->B:398:0x075c BREAK  A[LOOP:7: B:344:0x0681->B:397:0x0751], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0103  */
    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x0139  */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162  */
    /* JADX WARN: Code duplicated, block: B:61:0x016b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0175  */
    /* JADX WARN: Code duplicated, block: B:67:0x017a  */
    /* JADX WARN: Code duplicated, block: B:69:0x018e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0191  */
    /* JADX WARN: Code duplicated, block: B:73:0x0197  */
    /* JADX WARN: Code duplicated, block: B:74:0x019a  */
    /* JADX WARN: Code duplicated, block: B:76:0x019d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d5  */
    public final void e(wx1 wx1Var, int i, int i2, int i3) {
        int iMax;
        int i4;
        int iMax2;
        vx1.a aVar;
        int iO;
        ey2 ey2Var;
        int[] iArr;
        int i5;
        int i6;
        ll0 ll0Var;
        wx1 wx1Var2;
        ArrayList<vx1> arrayList;
        ll0.b bVar;
        int size;
        int iO2;
        int i7;
        boolean zB;
        boolean z;
        vx1.a aVar2;
        int i8;
        boolean z2;
        boolean z3;
        wx1 wx1Var3;
        ArrayList<vx1> arrayList2;
        vx1.a aVar3;
        vx1.a aVar4;
        int i9;
        boolean zQ;
        int i10;
        int size2;
        int i11;
        vx1.a[] aVarArr;
        vx1.a aVar5;
        boolean z4;
        boolean z5;
        int iMax3;
        int iMax4;
        int i12;
        boolean z6;
        sx1.a aVar6;
        sx1.a aVar7;
        boolean z7;
        boolean z8;
        boolean z9;
        ll0.b bVar2;
        ArrayList<vx1> arrayList3;
        int i13;
        int i14;
        int i15;
        int i16;
        vx1 vx1Var;
        int iO3;
        int i17;
        int i18;
        int i19;
        boolean zA;
        int i20;
        int iO4;
        int i21;
        boolean z10;
        vx1 vx1Var2;
        boolean z11;
        int iO5;
        int i22;
        boolean z12;
        ll0.b bVar3;
        boolean zA2;
        int iO6;
        int i23;
        boolean z13;
        int size3;
        ll0.b bVar4;
        int i24;
        ConstraintLayout constraintLayout;
        int childCount;
        ArrayList<androidx.constraintlayout.widget.b> arrayList4;
        int i25;
        int size4;
        int i26;
        View childAt;
        Placeholder placeholder;
        a aVar8;
        vx1 vx1Var3;
        vx1 vx1Var4;
        vx1 vx1Var5;
        vx1 vx1Var6;
        vx1.a aVarH;
        vx1.a aVarH2;
        boolean z14;
        o15 o15Var;
        meb mebVar;
        int iMin;
        int iMin2;
        int i27;
        boolean z15;
        wx1 wx1Var4;
        int i28;
        int i29;
        ArrayList<vx1> arrayList5;
        int size5;
        int i30;
        boolean z16;
        boolean z17;
        int i31;
        int i32;
        int i33;
        boolean z18;
        boolean z19;
        int i34;
        vx1 vx1Var7;
        int i35;
        vx1.a[] aVarArr2;
        boolean z20;
        boolean z21;
        boolean z22;
        int mode = View.MeasureSpec.getMode(i2);
        int size6 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size7 = View.MeasureSpec.getSize(i3);
        int iMax5 = Math.max(0, getPaddingTop());
        int iMax6 = Math.max(0, getPaddingBottom());
        int i36 = iMax5 + iMax6;
        int paddingWidth = getPaddingWidth();
        b bVar5 = this.H;
        bVar5.b = iMax5;
        bVar5.c = iMax6;
        bVar5.d = paddingWidth;
        bVar5.e = i36;
        bVar5.f = i2;
        bVar5.g = i3;
        int iMax7 = Math.max(0, getPaddingStart());
        int iMax8 = Math.max(0, getPaddingEnd());
        if (iMax7 <= 0 && iMax8 <= 0) {
            iMax7 = Math.max(0, getPaddingLeft());
        } else if (c()) {
            iMax7 = iMax8;
        }
        int i37 = size6 - paddingWidth;
        int i38 = size7 - i36;
        int i39 = bVar5.e;
        int i40 = bVar5.d;
        int childCount2 = getChildCount();
        vx1.a aVar9 = vx1.a.u;
        vx1.a aVar10 = vx1.a.t;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                iMax = mode != 1073741824 ? 0 : Math.min(this.y - i40, i37);
                i4 = Integer.MIN_VALUE;
                aVar9 = aVar10;
            } else {
                if (childCount2 == 0) {
                    iMax = Math.max(0, this.w);
                } else {
                    iMax = 0;
                }
                i4 = Integer.MIN_VALUE;
            }
            if (mode2 != i4) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        aVar = aVar10;
                        iMax2 = 0;
                    } else {
                        iMax2 = Math.min(this.z - i39, i38);
                        aVar = aVar10;
                    }
                } else if (childCount2 == 0) {
                    aVar = aVar9;
                    iMax2 = Math.max(0, this.x);
                } else {
                    iMax2 = 0;
                }
                iO = wx1Var.o();
                ey2Var = wx1Var.t0;
                iArr = wx1Var.C;
                if (iMax == iO || iMax2 != wx1Var.i()) {
                    ey2Var.c = true;
                }
                wx1Var.a0 = 0;
                wx1Var.b0 = 0;
                iArr[0] = this.y - i40;
                iArr[1] = this.z - i39;
                wx1Var.d0 = 0;
                wx1Var.e0 = 0;
                wx1Var.I(aVar9);
                wx1Var.K(iMax);
                wx1Var.J(aVar);
                wx1Var.H(iMax2);
                i5 = this.w - i40;
                if (i5 < 0) {
                    wx1Var.d0 = 0;
                } else {
                    wx1Var.d0 = i5;
                }
                i6 = this.x - i39;
                if (i6 < 0) {
                    wx1Var.e0 = 0;
                } else {
                    wx1Var.e0 = i6;
                }
                wx1Var.y0 = iMax7;
                wx1Var.z0 = iMax5;
                ll0Var = wx1Var.s0;
                wx1Var2 = ll0Var.c;
                arrayList = ll0Var.a;
                bVar = wx1Var.v0;
                size = wx1Var.r0.size();
                iO2 = wx1Var.o();
                i7 = wx1Var.i();
                zB = lk7.b(i, 128);
                if (!zB || lk7.b(i, 64)) {
                    z = true;
                } else {
                    z = false;
                }
                aVar2 = vx1.a.v;
                boolean z23 = z;
                if (z) {
                    i34 = 0;
                    while (true) {
                        i8 = size;
                        if (i34 < size) {
                            vx1Var7 = wx1Var.r0.get(i34);
                            i35 = i34;
                            aVarArr2 = vx1Var7.U;
                            if (aVarArr2[0] == aVar2) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            if (aVarArr2[1] == aVar2) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if (z20 || !z21 || vx1Var7.Y <= 0.0f) {
                                z22 = false;
                            } else {
                                z22 = true;
                            }
                            if ((vx1Var7.v() || !z22) && !((vx1Var7.w() && z22) || (vx1Var7 instanceof kjb) || vx1Var7.v() || vx1Var7.w())) {
                                i34 = i35 + 1;
                                size = i8;
                            } else {
                                z2 = false;
                            }
                        }
                        z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
                        if (z3) {
                            iMin = Math.min(iArr[0], i37);
                            iMin2 = Math.min(iArr[1], i38);
                            i27 = 1073741824;
                            if (mode == 1073741824) {
                                if (wx1Var.o() != iMin) {
                                    wx1Var.K(iMin);
                                    z15 = true;
                                    ey2Var.b = true;
                                } else {
                                    z15 = true;
                                }
                                i27 = 1073741824;
                            } else {
                                z15 = true;
                            }
                            if (mode2 == i27) {
                                if (wx1Var.i() != iMin2) {
                                    wx1Var.H(iMin2);
                                    ey2Var.b = z15;
                                }
                                i27 = 1073741824;
                            }
                            if (mode == i27 || mode2 != i27) {
                                z3 = z3;
                                wx1Var3 = wx1Var2;
                                arrayList2 = arrayList;
                                bVar = bVar;
                                aVar3 = aVar10;
                                aVar4 = aVar9;
                                wx1Var4 = ey2Var.a;
                                if (ey2Var.b) {
                                    arrayList5 = wx1Var4.r0;
                                    i30 = 0;
                                    for (size5 = arrayList5.size(); i30 < size5; size5 = size5) {
                                        vx1 vx1Var8 = arrayList5.get(i30);
                                        i30++;
                                        vx1 vx1Var9 = vx1Var8;
                                        vx1Var9.f();
                                        vx1Var9.a = false;
                                        ArrayList<vx1> arrayList6 = arrayList5;
                                        o15 o15Var2 = vx1Var9.d;
                                        o15Var2.e.j = false;
                                        o15Var2.g = false;
                                        o15Var2.n();
                                        meb mebVar2 = vx1Var9.e;
                                        mebVar2.e.j = false;
                                        mebVar2.g = false;
                                        mebVar2.m();
                                        arrayList5 = arrayList6;
                                    }
                                    i28 = 0;
                                    wx1Var4.f();
                                    wx1Var4.a = false;
                                    o15 o15Var3 = wx1Var4.d;
                                    o15Var3.e.j = false;
                                    o15Var3.g = false;
                                    o15Var3.n();
                                    meb mebVar3 = wx1Var4.e;
                                    mebVar3.e.j = false;
                                    mebVar3.g = false;
                                    mebVar3.m();
                                    ey2Var.c();
                                } else {
                                    i28 = 0;
                                }
                                ey2Var.b(ey2Var.d);
                                wx1Var4.a0 = i28;
                                wx1Var4.b0 = i28;
                                wx1Var4.d.h.d(i28);
                                wx1Var4.e.h.d(i28);
                                i29 = 1073741824;
                                if (mode == 1073741824) {
                                    zQ = wx1Var.Q(i28, zB);
                                    i9 = 1;
                                } else {
                                    i9 = 0;
                                    zQ = true;
                                }
                                if (mode2 == 1073741824) {
                                    zQ &= wx1Var.Q(1, zB);
                                    i9++;
                                }
                            } else {
                                ArrayList<dmb> arrayList7 = ey2Var.e;
                                wx1 wx1Var5 = ey2Var.a;
                                if (ey2Var.b || ey2Var.c) {
                                    ArrayList<vx1> arrayList8 = wx1Var5.r0;
                                    int size8 = arrayList8.size();
                                    int i41 = 0;
                                    while (i41 < size8) {
                                        int i42 = size8;
                                        vx1 vx1Var10 = arrayList8.get(i41);
                                        vx1Var10.f();
                                        vx1Var10.a = false;
                                        vx1Var10.d.n();
                                        vx1Var10.e.m();
                                        i41++;
                                        size8 = i42;
                                    }
                                    wx1Var5.f();
                                    i31 = 0;
                                    wx1Var5.a = false;
                                    wx1Var5.d.n();
                                    wx1Var5.e.m();
                                    ey2Var.c = false;
                                } else {
                                    i31 = 0;
                                }
                                ey2Var.b(ey2Var.d);
                                wx1Var5.a0 = i31;
                                vx1.a[] aVarArr3 = wx1Var5.U;
                                wx1Var5.b0 = i31;
                                vx1.a aVarH3 = wx1Var5.h(i31);
                                vx1.a aVarH4 = wx1Var5.h(1);
                                if (ey2Var.b) {
                                    ey2Var.c();
                                }
                                int iP = wx1Var5.p();
                                arrayList2 = arrayList;
                                int iQ = wx1Var5.q();
                                wx1Var3 = wx1Var2;
                                wx1Var5.d.h.d(iP);
                                wx1Var5.e.h.d(iQ);
                                ey2Var.g();
                                aVar4 = aVar9;
                                if (aVarH3 == aVar4 || aVarH4 == aVar4) {
                                    i32 = iQ;
                                    if (zB) {
                                        int size9 = arrayList7.size();
                                        i33 = iP;
                                        int i43 = 0;
                                        while (i43 < size9) {
                                            dmb dmbVar = arrayList7.get(i43);
                                            i43++;
                                            if (!dmbVar.k()) {
                                                zB = false;
                                                break;
                                            }
                                        }
                                    } else {
                                        i33 = iP;
                                    }
                                    if (zB && aVarH3 == aVar4) {
                                        aVar3 = aVar10;
                                        wx1Var5.I(aVar3);
                                        wx1Var5.K(ey2Var.d(wx1Var5, 0));
                                        wx1Var5.d.e.d(wx1Var5.o());
                                    } else {
                                        aVar3 = aVar10;
                                    }
                                    if (zB && aVarH4 == aVar4) {
                                        wx1Var5.J(aVar3);
                                        wx1Var5.H(ey2Var.d(wx1Var5, 1));
                                        wx1Var5.e.e.d(wx1Var5.i());
                                    }
                                } else {
                                    i32 = iQ;
                                    i33 = iP;
                                    aVar3 = aVar10;
                                }
                                vx1.a aVar11 = aVarArr3[0];
                                vx1.a aVar12 = vx1.a.w;
                                if (aVar11 == aVar3 || aVar11 == aVar12) {
                                    int iO7 = wx1Var5.o() + i33;
                                    wx1Var5.d.i.d(iO7);
                                    wx1Var5.d.e.d(iO7 - i33);
                                    ey2Var.g();
                                    vx1.a aVar13 = aVarArr3[1];
                                    if (aVar13 == aVar3 || aVar13 == aVar12) {
                                        int i44 = wx1Var5.i() + i32;
                                        wx1Var5.e.i.d(i44);
                                        wx1Var5.e.e.d(i44 - i32);
                                    }
                                    ey2Var.g();
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                int size10 = arrayList7.size();
                                int i45 = 0;
                                while (i45 < size10) {
                                    dmb dmbVar2 = arrayList7.get(i45);
                                    i45++;
                                    dmb dmbVar3 = dmbVar2;
                                    boolean z24 = z18;
                                    if (dmbVar3.b != wx1Var5 || dmbVar3.g) {
                                        dmbVar3.e();
                                    }
                                    z18 = z24;
                                }
                                boolean z25 = z18;
                                int size11 = arrayList7.size();
                                int i46 = 0;
                                while (true) {
                                    if (i46 >= size11) {
                                        z19 = true;
                                        break;
                                    }
                                    dmb dmbVar4 = arrayList7.get(i46);
                                    i46++;
                                    dmb dmbVar5 = dmbVar4;
                                    if (z25 || dmbVar5.b != wx1Var5) {
                                        if (!dmbVar5.h.j || ((!dmbVar5.i.j && !(dmbVar5 instanceof wp4)) || (!dmbVar5.e.j && !(dmbVar5 instanceof f61) && !(dmbVar5 instanceof wp4)))) {
                                            z19 = false;
                                            break;
                                        }
                                    }
                                }
                                wx1Var5.I(aVarH3);
                                wx1Var5.J(aVarH4);
                                zQ = z19;
                                i29 = 1073741824;
                                i9 = 2;
                            }
                            if (zQ) {
                                if (mode == i29) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (mode2 == i29) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                wx1Var.L(z16, z17);
                            }
                        } else {
                            z3 = z3;
                            wx1Var3 = wx1Var2;
                            arrayList2 = arrayList;
                            bVar = bVar;
                            aVar3 = aVar10;
                            aVar4 = aVar9;
                            i9 = 0;
                            zQ = false;
                        }
                        if (zQ || i9 != 2) {
                            i10 = wx1Var.E0;
                            if (i8 > 0) {
                                size3 = wx1Var.r0.size();
                                boolean zS = wx1Var.S(64);
                                bVar4 = wx1Var.v0;
                                for (i24 = 0; i24 < size3; i24++) {
                                    vx1Var6 = wx1Var.r0.get(i24);
                                    if (!(vx1Var6 instanceof vp4) && !(vx1Var6 instanceof rj0) && !vx1Var6.G && (!zS || (o15Var = vx1Var6.d) == null || (mebVar = vx1Var6.e) == null || !o15Var.e.j || !mebVar.e.j)) {
                                        aVarH = vx1Var6.h(0);
                                        aVarH2 = vx1Var6.h(1);
                                        if (aVarH == aVar2 || vx1Var6.r == 1 || aVarH2 != aVar2 || vx1Var6.s == 1) {
                                            z14 = false;
                                        } else {
                                            z14 = true;
                                        }
                                        if (!z14 && wx1Var.S(1) && !(vx1Var6 instanceof kjb)) {
                                            if (aVarH == aVar2 && vx1Var6.r == 0 && aVarH2 != aVar2 && !vx1Var6.v()) {
                                                z14 = true;
                                            }
                                            if (aVarH2 == aVar2 && vx1Var6.s == 0 && aVarH != aVar2 && !vx1Var6.v()) {
                                                z14 = true;
                                            }
                                            if ((aVarH != aVar2 || aVarH2 == aVar2) && vx1Var6.Y > 0.0f) {
                                            }
                                        }
                                        if (z14) {
                                            ll0Var.a(0, bVar4, vx1Var6);
                                        }
                                    }
                                }
                                constraintLayout = ((b) bVar4).a;
                                childCount = constraintLayout.getChildCount();
                                arrayList4 = constraintLayout.u;
                                for (i25 = 0; i25 < childCount; i25++) {
                                    childAt = constraintLayout.getChildAt(i25);
                                    if (childAt instanceof Placeholder) {
                                        placeholder = (Placeholder) childAt;
                                        if (placeholder.u == null) {
                                            a aVar14 = (a) placeholder.getLayoutParams();
                                            aVar8 = (a) placeholder.u.getLayoutParams();
                                            vx1Var3 = aVar8.q0;
                                            vx1Var3.i0 = 0;
                                            vx1Var4 = aVar14.q0;
                                            if (vx1Var4.U[0] != aVar3) {
                                                vx1Var4.K(vx1Var3.o());
                                            }
                                            vx1Var5 = aVar14.q0;
                                            if (vx1Var5.U[1] != aVar3) {
                                                vx1Var5.H(aVar8.q0.i());
                                            }
                                            aVar8.q0.i0 = 8;
                                        }
                                    }
                                }
                                size4 = arrayList4.size();
                                if (size4 > 0) {
                                    for (i26 = 0; i26 < size4; i26++) {
                                        arrayList4.get(i26).getClass();
                                    }
                                }
                            }
                            ll0Var.c(wx1Var);
                            size2 = arrayList2.size();
                            if (i8 > 0) {
                                ll0Var.b(wx1Var, 0, iO2, i7);
                            }
                            if (size2 > 0) {
                                aVarArr = wx1Var.U;
                                aVar5 = aVar4;
                                if (aVarArr[0] == aVar5) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (aVarArr[1] == aVar5) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                wx1 wx1Var6 = wx1Var3;
                                iMax3 = Math.max(wx1Var.o(), wx1Var6.d0);
                                iMax4 = Math.max(wx1Var.i(), wx1Var6.e0);
                                i12 = 0;
                                z6 = false;
                                while (true) {
                                    aVar6 = sx1.a.w;
                                    aVar7 = sx1.a.v;
                                    if (i12 < size2) {
                                        break;
                                    }
                                    ArrayList<vx1> arrayList9 = arrayList2;
                                    vx1Var2 = arrayList9.get(i12);
                                    z11 = z5;
                                    if (vx1Var2 instanceof kjb) {
                                        iO5 = vx1Var2.o();
                                        i22 = vx1Var2.i();
                                        z12 = z4;
                                        bVar3 = bVar;
                                        zA2 = z6 | ll0Var.a(1, bVar3, vx1Var2);
                                        iO6 = vx1Var2.o();
                                        i23 = vx1Var2.i();
                                        if (iO6 != iO5) {
                                            vx1Var2.K(iO6);
                                            if (z12 && vx1Var2.p() + vx1Var2.W > iMax3) {
                                                iMax3 = Math.max(iMax3, vx1Var2.g(aVar7).d() + vx1Var2.p() + vx1Var2.W);
                                            }
                                            z13 = true;
                                        } else {
                                            z13 = zA2;
                                        }
                                        if (i23 != i22) {
                                            vx1Var2.H(i23);
                                            if (z11 && vx1Var2.q() + vx1Var2.X > iMax4) {
                                                iMax4 = Math.max(iMax4, vx1Var2.g(aVar6).d() + vx1Var2.q() + vx1Var2.X);
                                            }
                                            z13 = true;
                                        }
                                        z6 = z13;
                                    } else {
                                        z12 = z4;
                                        bVar3 = bVar;
                                    }
                                    i12++;
                                    z5 = z11;
                                    bVar = bVar3;
                                    arrayList2 = arrayList9;
                                    i10 = i10;
                                    z4 = z12;
                                }
                                int i47 = i10;
                                z7 = z5;
                                z8 = z4;
                                z9 = z6;
                                bVar2 = bVar;
                                arrayList3 = arrayList2;
                                i13 = 0;
                                while (i13 < 2) {
                                    i14 = 0;
                                    while (i14 < size2) {
                                        vx1Var = arrayList3.get(i14);
                                        if (((vx1Var instanceof dw4) || (vx1Var instanceof kjb)) && !(vx1Var instanceof vp4)) {
                                            if (vx1Var.i0 == 8 && ((!z3 || !vx1Var.d.e.j || !vx1Var.e.e.j) && !(vx1Var instanceof kjb))) {
                                                iO3 = vx1Var.o();
                                                i17 = vx1Var.i();
                                                i18 = size2;
                                                int i48 = vx1Var.c0;
                                                i19 = i14;
                                                zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                                                i20 = i13;
                                                iO4 = vx1Var.o();
                                                i21 = vx1Var.i();
                                                if (iO4 != iO3) {
                                                    vx1Var.K(iO4);
                                                    if (z8 && vx1Var.p() + vx1Var.W > iMax3) {
                                                        iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                                                    }
                                                    z10 = true;
                                                } else {
                                                    z10 = zA;
                                                }
                                                if (i21 != i17) {
                                                    vx1Var.H(i21);
                                                    if (z7 && vx1Var.q() + vx1Var.X > iMax4) {
                                                        iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                                                    }
                                                    z10 = true;
                                                }
                                                if (vx1Var.E || i48 == vx1Var.c0) {
                                                    z9 = z10;
                                                } else {
                                                    z9 = true;
                                                }
                                            }
                                            i14 = i19 + 1;
                                            size2 = i18;
                                            i13 = i20;
                                        }
                                        i18 = size2;
                                        i20 = i13;
                                        i19 = i14;
                                        i14 = i19 + 1;
                                        size2 = i18;
                                        i13 = i20;
                                    }
                                    i15 = size2;
                                    i16 = i13;
                                    if (z9) {
                                        break;
                                    }
                                    i13 = i16 + 1;
                                    ll0Var.b(wx1Var, i13, iO2, i7);
                                    size2 = i15;
                                    z9 = false;
                                }
                                i11 = i47;
                            } else {
                                i11 = i10;
                            }
                            wx1Var.E0 = i11;
                            j86.q = wx1Var.S(512);
                        }
                        return;
                    }
                }
                i8 = size;
                z2 = z23;
                z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
                if (z3) {
                    iMin = Math.min(iArr[0], i37);
                    iMin2 = Math.min(iArr[1], i38);
                    i27 = 1073741824;
                    if (mode == 1073741824) {
                        if (wx1Var.o() != iMin) {
                            wx1Var.K(iMin);
                            z15 = true;
                            ey2Var.b = true;
                        } else {
                            z15 = true;
                        }
                        i27 = 1073741824;
                    } else {
                        z15 = true;
                    }
                    if (mode2 == i27) {
                        if (wx1Var.i() != iMin2) {
                            wx1Var.H(iMin2);
                            ey2Var.b = z15;
                        }
                        i27 = 1073741824;
                    }
                    if (mode == i27) {
                        z3 = z3;
                        wx1Var3 = wx1Var2;
                        arrayList2 = arrayList;
                        bVar = bVar;
                        aVar3 = aVar10;
                        aVar4 = aVar9;
                        wx1Var4 = ey2Var.a;
                        if (ey2Var.b) {
                            arrayList5 = wx1Var4.r0;
                            i30 = 0;
                            while (i30 < size5) {
                                vx1 vx1Var11 = arrayList5.get(i30);
                                i30++;
                                vx1 vx1Var12 = vx1Var11;
                                vx1Var12.f();
                                vx1Var12.a = false;
                                ArrayList<vx1> arrayList10 = arrayList5;
                                o15 o15Var4 = vx1Var12.d;
                                o15Var4.e.j = false;
                                o15Var4.g = false;
                                o15Var4.n();
                                meb mebVar4 = vx1Var12.e;
                                mebVar4.e.j = false;
                                mebVar4.g = false;
                                mebVar4.m();
                                arrayList5 = arrayList10;
                            }
                            i28 = 0;
                            wx1Var4.f();
                            wx1Var4.a = false;
                            o15 o15Var5 = wx1Var4.d;
                            o15Var5.e.j = false;
                            o15Var5.g = false;
                            o15Var5.n();
                            meb mebVar5 = wx1Var4.e;
                            mebVar5.e.j = false;
                            mebVar5.g = false;
                            mebVar5.m();
                            ey2Var.c();
                        } else {
                            i28 = 0;
                        }
                        ey2Var.b(ey2Var.d);
                        wx1Var4.a0 = i28;
                        wx1Var4.b0 = i28;
                        wx1Var4.d.h.d(i28);
                        wx1Var4.e.h.d(i28);
                        i29 = 1073741824;
                        if (mode == 1073741824) {
                            zQ = wx1Var.Q(i28, zB);
                            i9 = 1;
                        } else {
                            i9 = 0;
                            zQ = true;
                        }
                        if (mode2 == 1073741824) {
                            zQ &= wx1Var.Q(1, zB);
                            i9++;
                        }
                    } else {
                        z3 = z3;
                        wx1Var3 = wx1Var2;
                        arrayList2 = arrayList;
                        bVar = bVar;
                        aVar3 = aVar10;
                        aVar4 = aVar9;
                        wx1Var4 = ey2Var.a;
                        if (ey2Var.b) {
                            arrayList5 = wx1Var4.r0;
                            i30 = 0;
                            while (i30 < size5) {
                                vx1 vx1Var13 = arrayList5.get(i30);
                                i30++;
                                vx1 vx1Var14 = vx1Var13;
                                vx1Var14.f();
                                vx1Var14.a = false;
                                ArrayList<vx1> arrayList11 = arrayList5;
                                o15 o15Var6 = vx1Var14.d;
                                o15Var6.e.j = false;
                                o15Var6.g = false;
                                o15Var6.n();
                                meb mebVar6 = vx1Var14.e;
                                mebVar6.e.j = false;
                                mebVar6.g = false;
                                mebVar6.m();
                                arrayList5 = arrayList11;
                            }
                            i28 = 0;
                            wx1Var4.f();
                            wx1Var4.a = false;
                            o15 o15Var7 = wx1Var4.d;
                            o15Var7.e.j = false;
                            o15Var7.g = false;
                            o15Var7.n();
                            meb mebVar7 = wx1Var4.e;
                            mebVar7.e.j = false;
                            mebVar7.g = false;
                            mebVar7.m();
                            ey2Var.c();
                        } else {
                            i28 = 0;
                        }
                        ey2Var.b(ey2Var.d);
                        wx1Var4.a0 = i28;
                        wx1Var4.b0 = i28;
                        wx1Var4.d.h.d(i28);
                        wx1Var4.e.h.d(i28);
                        i29 = 1073741824;
                        if (mode == 1073741824) {
                            zQ = wx1Var.Q(i28, zB);
                            i9 = 1;
                        } else {
                            i9 = 0;
                            zQ = true;
                        }
                        if (mode2 == 1073741824) {
                            zQ &= wx1Var.Q(1, zB);
                            i9++;
                        }
                    }
                    if (zQ) {
                        if (mode == i29) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (mode2 == i29) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        wx1Var.L(z16, z17);
                    }
                } else {
                    z3 = z3;
                    wx1Var3 = wx1Var2;
                    arrayList2 = arrayList;
                    bVar = bVar;
                    aVar3 = aVar10;
                    aVar4 = aVar9;
                    i9 = 0;
                    zQ = false;
                }
                if (zQ) {
                }
                i10 = wx1Var.E0;
                if (i8 > 0) {
                    size3 = wx1Var.r0.size();
                    boolean zS2 = wx1Var.S(64);
                    bVar4 = wx1Var.v0;
                    while (i24 < size3) {
                        vx1Var6 = wx1Var.r0.get(i24);
                        if (!(vx1Var6 instanceof vp4)) {
                            aVarH = vx1Var6.h(0);
                            aVarH2 = vx1Var6.h(1);
                            if (aVarH == aVar2) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                if (aVarH == aVar2) {
                                    z14 = true;
                                }
                                if (aVarH2 == aVar2) {
                                    z14 = true;
                                }
                                z14 = aVarH != aVar2 ? true : true;
                            }
                            if (z14) {
                                ll0Var.a(0, bVar4, vx1Var6);
                            }
                        }
                    }
                    constraintLayout = ((b) bVar4).a;
                    childCount = constraintLayout.getChildCount();
                    arrayList4 = constraintLayout.u;
                    while (i25 < childCount) {
                        childAt = constraintLayout.getChildAt(i25);
                        if (childAt instanceof Placeholder) {
                            placeholder = (Placeholder) childAt;
                            if (placeholder.u == null) {
                                a aVar15 = (a) placeholder.getLayoutParams();
                                aVar8 = (a) placeholder.u.getLayoutParams();
                                vx1Var3 = aVar8.q0;
                                vx1Var3.i0 = 0;
                                vx1Var4 = aVar15.q0;
                                if (vx1Var4.U[0] != aVar3) {
                                    vx1Var4.K(vx1Var3.o());
                                }
                                vx1Var5 = aVar15.q0;
                                if (vx1Var5.U[1] != aVar3) {
                                    vx1Var5.H(aVar8.q0.i());
                                }
                                aVar8.q0.i0 = 8;
                            }
                        }
                    }
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        while (i26 < size4) {
                            arrayList4.get(i26).getClass();
                        }
                    }
                }
                ll0Var.c(wx1Var);
                size2 = arrayList2.size();
                if (i8 > 0) {
                    ll0Var.b(wx1Var, 0, iO2, i7);
                }
                if (size2 > 0) {
                    aVarArr = wx1Var.U;
                    aVar5 = aVar4;
                    if (aVarArr[0] == aVar5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (aVarArr[1] == aVar5) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    wx1 wx1Var7 = wx1Var3;
                    iMax3 = Math.max(wx1Var.o(), wx1Var7.d0);
                    iMax4 = Math.max(wx1Var.i(), wx1Var7.e0);
                    i12 = 0;
                    z6 = false;
                    while (true) {
                        aVar6 = sx1.a.w;
                        aVar7 = sx1.a.v;
                        if (i12 < size2) {
                            break;
                            break;
                        }
                        ArrayList<vx1> arrayList12 = arrayList2;
                        vx1Var2 = arrayList12.get(i12);
                        z11 = z5;
                        if (vx1Var2 instanceof kjb) {
                            z12 = z4;
                            bVar3 = bVar;
                        } else {
                            iO5 = vx1Var2.o();
                            i22 = vx1Var2.i();
                            z12 = z4;
                            bVar3 = bVar;
                            zA2 = z6 | ll0Var.a(1, bVar3, vx1Var2);
                            iO6 = vx1Var2.o();
                            i23 = vx1Var2.i();
                            if (iO6 != iO5) {
                                vx1Var2.K(iO6);
                                if (z12) {
                                    iMax3 = Math.max(iMax3, vx1Var2.g(aVar7).d() + vx1Var2.p() + vx1Var2.W);
                                }
                                z13 = true;
                            } else {
                                z13 = zA2;
                            }
                            if (i23 != i22) {
                                vx1Var2.H(i23);
                                if (z11) {
                                    iMax4 = Math.max(iMax4, vx1Var2.g(aVar6).d() + vx1Var2.q() + vx1Var2.X);
                                }
                                z13 = true;
                            }
                            z6 = z13;
                        }
                        i12++;
                        z5 = z11;
                        bVar = bVar3;
                        arrayList2 = arrayList12;
                        i10 = i10;
                        z4 = z12;
                    }
                    int i49 = i10;
                    z7 = z5;
                    z8 = z4;
                    z9 = z6;
                    bVar2 = bVar;
                    arrayList3 = arrayList2;
                    i13 = 0;
                    while (i13 < 2) {
                        i14 = 0;
                        while (i14 < size2) {
                            vx1Var = arrayList3.get(i14);
                            if (vx1Var instanceof dw4) {
                                if (vx1Var.i0 == 8) {
                                    i18 = size2;
                                    i20 = i13;
                                    i19 = i14;
                                } else {
                                    iO3 = vx1Var.o();
                                    i17 = vx1Var.i();
                                    i18 = size2;
                                    int i410 = vx1Var.c0;
                                    i19 = i14;
                                    zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                                    i20 = i13;
                                    iO4 = vx1Var.o();
                                    i21 = vx1Var.i();
                                    if (iO4 != iO3) {
                                        vx1Var.K(iO4);
                                        if (z8) {
                                            iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                                        }
                                        z10 = true;
                                    } else {
                                        z10 = zA;
                                    }
                                    if (i21 != i17) {
                                        vx1Var.H(i21);
                                        if (z7) {
                                            iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                                        }
                                        z10 = true;
                                    }
                                    if (vx1Var.E) {
                                        z9 = z10;
                                    } else {
                                        z9 = z10;
                                    }
                                }
                            } else if (vx1Var.i0 == 8) {
                                i18 = size2;
                                i20 = i13;
                                i19 = i14;
                            } else {
                                iO3 = vx1Var.o();
                                i17 = vx1Var.i();
                                i18 = size2;
                                int i411 = vx1Var.c0;
                                i19 = i14;
                                zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                                i20 = i13;
                                iO4 = vx1Var.o();
                                i21 = vx1Var.i();
                                if (iO4 != iO3) {
                                    vx1Var.K(iO4);
                                    if (z8) {
                                        iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                                    }
                                    z10 = true;
                                } else {
                                    z10 = zA;
                                }
                                if (i21 != i17) {
                                    vx1Var.H(i21);
                                    if (z7) {
                                        iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                                    }
                                    z10 = true;
                                }
                                if (vx1Var.E) {
                                    z9 = z10;
                                } else {
                                    z9 = z10;
                                }
                            }
                            i14 = i19 + 1;
                            size2 = i18;
                            i13 = i20;
                        }
                        i15 = size2;
                        i16 = i13;
                        if (z9) {
                            break;
                            break;
                        }
                        i13 = i16 + 1;
                        ll0Var.b(wx1Var, i13, iO2, i7);
                        size2 = i15;
                        z9 = false;
                    }
                    i11 = i49;
                } else {
                    i11 = i10;
                }
                wx1Var.E0 = i11;
                j86.q = wx1Var.S(512);
            }
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.x);
            } else {
                iMax2 = i38;
            }
            aVar = aVar9;
            iO = wx1Var.o();
            ey2Var = wx1Var.t0;
            iArr = wx1Var.C;
            if (iMax == iO) {
                ey2Var.c = true;
            } else {
                ey2Var.c = true;
            }
            wx1Var.a0 = 0;
            wx1Var.b0 = 0;
            iArr[0] = this.y - i40;
            iArr[1] = this.z - i39;
            wx1Var.d0 = 0;
            wx1Var.e0 = 0;
            wx1Var.I(aVar9);
            wx1Var.K(iMax);
            wx1Var.J(aVar);
            wx1Var.H(iMax2);
            i5 = this.w - i40;
            if (i5 < 0) {
                wx1Var.d0 = 0;
            } else {
                wx1Var.d0 = i5;
            }
            i6 = this.x - i39;
            if (i6 < 0) {
                wx1Var.e0 = 0;
            } else {
                wx1Var.e0 = i6;
            }
            wx1Var.y0 = iMax7;
            wx1Var.z0 = iMax5;
            ll0Var = wx1Var.s0;
            wx1Var2 = ll0Var.c;
            arrayList = ll0Var.a;
            bVar = wx1Var.v0;
            size = wx1Var.r0.size();
            iO2 = wx1Var.o();
            i7 = wx1Var.i();
            zB = lk7.b(i, 128);
            if (zB) {
                z = true;
            } else {
                z = true;
            }
            aVar2 = vx1.a.v;
            boolean z26 = z;
            if (z) {
                i34 = 0;
                while (true) {
                    i8 = size;
                    if (i34 < size) {
                        vx1Var7 = wx1Var.r0.get(i34);
                        i35 = i34;
                        aVarArr2 = vx1Var7.U;
                        if (aVarArr2[0] == aVar2) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (aVarArr2[1] == aVar2) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (z20) {
                            z22 = false;
                        } else {
                            z22 = false;
                        }
                        if (vx1Var7.v()) {
                            i34 = i35 + 1;
                            size = i8;
                        } else {
                            i34 = i35 + 1;
                            size = i8;
                        }
                        z2 = false;
                    }
                    z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
                    if (z3) {
                        iMin = Math.min(iArr[0], i37);
                        iMin2 = Math.min(iArr[1], i38);
                        i27 = 1073741824;
                        if (mode == 1073741824) {
                            if (wx1Var.o() != iMin) {
                                wx1Var.K(iMin);
                                z15 = true;
                                ey2Var.b = true;
                            } else {
                                z15 = true;
                            }
                            i27 = 1073741824;
                        } else {
                            z15 = true;
                        }
                        if (mode2 == i27) {
                            if (wx1Var.i() != iMin2) {
                                wx1Var.H(iMin2);
                                ey2Var.b = z15;
                            }
                            i27 = 1073741824;
                        }
                        if (mode == i27) {
                            z3 = z3;
                            wx1Var3 = wx1Var2;
                            arrayList2 = arrayList;
                            bVar = bVar;
                            aVar3 = aVar10;
                            aVar4 = aVar9;
                            wx1Var4 = ey2Var.a;
                            if (ey2Var.b) {
                                arrayList5 = wx1Var4.r0;
                                i30 = 0;
                                while (i30 < size5) {
                                    vx1 vx1Var15 = arrayList5.get(i30);
                                    i30++;
                                    vx1 vx1Var16 = vx1Var15;
                                    vx1Var16.f();
                                    vx1Var16.a = false;
                                    ArrayList<vx1> arrayList13 = arrayList5;
                                    o15 o15Var8 = vx1Var16.d;
                                    o15Var8.e.j = false;
                                    o15Var8.g = false;
                                    o15Var8.n();
                                    meb mebVar8 = vx1Var16.e;
                                    mebVar8.e.j = false;
                                    mebVar8.g = false;
                                    mebVar8.m();
                                    arrayList5 = arrayList13;
                                }
                                i28 = 0;
                                wx1Var4.f();
                                wx1Var4.a = false;
                                o15 o15Var9 = wx1Var4.d;
                                o15Var9.e.j = false;
                                o15Var9.g = false;
                                o15Var9.n();
                                meb mebVar9 = wx1Var4.e;
                                mebVar9.e.j = false;
                                mebVar9.g = false;
                                mebVar9.m();
                                ey2Var.c();
                            } else {
                                i28 = 0;
                            }
                            ey2Var.b(ey2Var.d);
                            wx1Var4.a0 = i28;
                            wx1Var4.b0 = i28;
                            wx1Var4.d.h.d(i28);
                            wx1Var4.e.h.d(i28);
                            i29 = 1073741824;
                            if (mode == 1073741824) {
                                zQ = wx1Var.Q(i28, zB);
                                i9 = 1;
                            } else {
                                i9 = 0;
                                zQ = true;
                            }
                            if (mode2 == 1073741824) {
                                zQ &= wx1Var.Q(1, zB);
                                i9++;
                            }
                        } else {
                            z3 = z3;
                            wx1Var3 = wx1Var2;
                            arrayList2 = arrayList;
                            bVar = bVar;
                            aVar3 = aVar10;
                            aVar4 = aVar9;
                            wx1Var4 = ey2Var.a;
                            if (ey2Var.b) {
                                arrayList5 = wx1Var4.r0;
                                i30 = 0;
                                while (i30 < size5) {
                                    vx1 vx1Var17 = arrayList5.get(i30);
                                    i30++;
                                    vx1 vx1Var18 = vx1Var17;
                                    vx1Var18.f();
                                    vx1Var18.a = false;
                                    ArrayList<vx1> arrayList14 = arrayList5;
                                    o15 o15Var10 = vx1Var18.d;
                                    o15Var10.e.j = false;
                                    o15Var10.g = false;
                                    o15Var10.n();
                                    meb mebVar10 = vx1Var18.e;
                                    mebVar10.e.j = false;
                                    mebVar10.g = false;
                                    mebVar10.m();
                                    arrayList5 = arrayList14;
                                }
                                i28 = 0;
                                wx1Var4.f();
                                wx1Var4.a = false;
                                o15 o15Var11 = wx1Var4.d;
                                o15Var11.e.j = false;
                                o15Var11.g = false;
                                o15Var11.n();
                                meb mebVar11 = wx1Var4.e;
                                mebVar11.e.j = false;
                                mebVar11.g = false;
                                mebVar11.m();
                                ey2Var.c();
                            } else {
                                i28 = 0;
                            }
                            ey2Var.b(ey2Var.d);
                            wx1Var4.a0 = i28;
                            wx1Var4.b0 = i28;
                            wx1Var4.d.h.d(i28);
                            wx1Var4.e.h.d(i28);
                            i29 = 1073741824;
                            if (mode == 1073741824) {
                                zQ = wx1Var.Q(i28, zB);
                                i9 = 1;
                            } else {
                                i9 = 0;
                                zQ = true;
                            }
                            if (mode2 == 1073741824) {
                                zQ &= wx1Var.Q(1, zB);
                                i9++;
                            }
                        }
                        if (zQ) {
                            if (mode == i29) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (mode2 == i29) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            wx1Var.L(z16, z17);
                        }
                    } else {
                        z3 = z3;
                        wx1Var3 = wx1Var2;
                        arrayList2 = arrayList;
                        bVar = bVar;
                        aVar3 = aVar10;
                        aVar4 = aVar9;
                        i9 = 0;
                        zQ = false;
                    }
                    if (zQ) {
                    }
                    i10 = wx1Var.E0;
                    if (i8 > 0) {
                        size3 = wx1Var.r0.size();
                        boolean zS3 = wx1Var.S(64);
                        bVar4 = wx1Var.v0;
                        while (i24 < size3) {
                            vx1Var6 = wx1Var.r0.get(i24);
                            if (!(vx1Var6 instanceof vp4)) {
                                aVarH = vx1Var6.h(0);
                                aVarH2 = vx1Var6.h(1);
                                if (aVarH == aVar2) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                if (!z14) {
                                    if (aVarH == aVar2) {
                                        z14 = true;
                                    }
                                    if (aVarH2 == aVar2) {
                                        z14 = true;
                                    }
                                    if (aVarH != aVar2) {
                                    }
                                }
                                if (z14) {
                                    ll0Var.a(0, bVar4, vx1Var6);
                                }
                            }
                        }
                        constraintLayout = ((b) bVar4).a;
                        childCount = constraintLayout.getChildCount();
                        arrayList4 = constraintLayout.u;
                        while (i25 < childCount) {
                            childAt = constraintLayout.getChildAt(i25);
                            if (childAt instanceof Placeholder) {
                                placeholder = (Placeholder) childAt;
                                if (placeholder.u == null) {
                                    a aVar16 = (a) placeholder.getLayoutParams();
                                    aVar8 = (a) placeholder.u.getLayoutParams();
                                    vx1Var3 = aVar8.q0;
                                    vx1Var3.i0 = 0;
                                    vx1Var4 = aVar16.q0;
                                    if (vx1Var4.U[0] != aVar3) {
                                        vx1Var4.K(vx1Var3.o());
                                    }
                                    vx1Var5 = aVar16.q0;
                                    if (vx1Var5.U[1] != aVar3) {
                                        vx1Var5.H(aVar8.q0.i());
                                    }
                                    aVar8.q0.i0 = 8;
                                }
                            }
                        }
                        size4 = arrayList4.size();
                        if (size4 > 0) {
                            while (i26 < size4) {
                                arrayList4.get(i26).getClass();
                            }
                        }
                    }
                    ll0Var.c(wx1Var);
                    size2 = arrayList2.size();
                    if (i8 > 0) {
                        ll0Var.b(wx1Var, 0, iO2, i7);
                    }
                    if (size2 > 0) {
                        aVarArr = wx1Var.U;
                        aVar5 = aVar4;
                        if (aVarArr[0] == aVar5) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (aVarArr[1] == aVar5) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        wx1 wx1Var8 = wx1Var3;
                        iMax3 = Math.max(wx1Var.o(), wx1Var8.d0);
                        iMax4 = Math.max(wx1Var.i(), wx1Var8.e0);
                        i12 = 0;
                        z6 = false;
                        while (true) {
                            aVar6 = sx1.a.w;
                            aVar7 = sx1.a.v;
                            if (i12 < size2) {
                                break;
                                break;
                            }
                            ArrayList<vx1> arrayList15 = arrayList2;
                            vx1Var2 = arrayList15.get(i12);
                            z11 = z5;
                            if (vx1Var2 instanceof kjb) {
                                z12 = z4;
                                bVar3 = bVar;
                            } else {
                                iO5 = vx1Var2.o();
                                i22 = vx1Var2.i();
                                z12 = z4;
                                bVar3 = bVar;
                                zA2 = z6 | ll0Var.a(1, bVar3, vx1Var2);
                                iO6 = vx1Var2.o();
                                i23 = vx1Var2.i();
                                if (iO6 != iO5) {
                                    vx1Var2.K(iO6);
                                    if (z12) {
                                        iMax3 = Math.max(iMax3, vx1Var2.g(aVar7).d() + vx1Var2.p() + vx1Var2.W);
                                    }
                                    z13 = true;
                                } else {
                                    z13 = zA2;
                                }
                                if (i23 != i22) {
                                    vx1Var2.H(i23);
                                    if (z11) {
                                        iMax4 = Math.max(iMax4, vx1Var2.g(aVar6).d() + vx1Var2.q() + vx1Var2.X);
                                    }
                                    z13 = true;
                                }
                                z6 = z13;
                            }
                            i12++;
                            z5 = z11;
                            bVar = bVar3;
                            arrayList2 = arrayList15;
                            i10 = i10;
                            z4 = z12;
                        }
                        int i412 = i10;
                        z7 = z5;
                        z8 = z4;
                        z9 = z6;
                        bVar2 = bVar;
                        arrayList3 = arrayList2;
                        i13 = 0;
                        while (i13 < 2) {
                            i14 = 0;
                            while (i14 < size2) {
                                vx1Var = arrayList3.get(i14);
                                if (vx1Var instanceof dw4) {
                                    if (vx1Var.i0 == 8) {
                                        i18 = size2;
                                        i20 = i13;
                                        i19 = i14;
                                    } else {
                                        iO3 = vx1Var.o();
                                        i17 = vx1Var.i();
                                        i18 = size2;
                                        int i413 = vx1Var.c0;
                                        i19 = i14;
                                        zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                                        i20 = i13;
                                        iO4 = vx1Var.o();
                                        i21 = vx1Var.i();
                                        if (iO4 != iO3) {
                                            vx1Var.K(iO4);
                                            if (z8) {
                                                iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                                            }
                                            z10 = true;
                                        } else {
                                            z10 = zA;
                                        }
                                        if (i21 != i17) {
                                            vx1Var.H(i21);
                                            if (z7) {
                                                iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                                            }
                                            z10 = true;
                                        }
                                        if (vx1Var.E) {
                                            z9 = z10;
                                        } else {
                                            z9 = z10;
                                        }
                                    }
                                } else if (vx1Var.i0 == 8) {
                                    i18 = size2;
                                    i20 = i13;
                                    i19 = i14;
                                } else {
                                    iO3 = vx1Var.o();
                                    i17 = vx1Var.i();
                                    i18 = size2;
                                    int i414 = vx1Var.c0;
                                    i19 = i14;
                                    zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                                    i20 = i13;
                                    iO4 = vx1Var.o();
                                    i21 = vx1Var.i();
                                    if (iO4 != iO3) {
                                        vx1Var.K(iO4);
                                        if (z8) {
                                            iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                                        }
                                        z10 = true;
                                    } else {
                                        z10 = zA;
                                    }
                                    if (i21 != i17) {
                                        vx1Var.H(i21);
                                        if (z7) {
                                            iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                                        }
                                        z10 = true;
                                    }
                                    if (vx1Var.E) {
                                        z9 = z10;
                                    } else {
                                        z9 = z10;
                                    }
                                }
                                i14 = i19 + 1;
                                size2 = i18;
                                i13 = i20;
                            }
                            i15 = size2;
                            i16 = i13;
                            if (z9) {
                                break;
                                break;
                            }
                            i13 = i16 + 1;
                            ll0Var.b(wx1Var, i13, iO2, i7);
                            size2 = i15;
                            z9 = false;
                        }
                        i11 = i412;
                    } else {
                        i11 = i10;
                    }
                    wx1Var.E0 = i11;
                    j86.q = wx1Var.S(512);
                }
            }
            i8 = size;
            z2 = z26;
            z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
            if (z3) {
                iMin = Math.min(iArr[0], i37);
                iMin2 = Math.min(iArr[1], i38);
                i27 = 1073741824;
                if (mode == 1073741824) {
                    if (wx1Var.o() != iMin) {
                        wx1Var.K(iMin);
                        z15 = true;
                        ey2Var.b = true;
                    } else {
                        z15 = true;
                    }
                    i27 = 1073741824;
                } else {
                    z15 = true;
                }
                if (mode2 == i27) {
                    if (wx1Var.i() != iMin2) {
                        wx1Var.H(iMin2);
                        ey2Var.b = z15;
                    }
                    i27 = 1073741824;
                }
                if (mode == i27) {
                    z3 = z3;
                    wx1Var3 = wx1Var2;
                    arrayList2 = arrayList;
                    bVar = bVar;
                    aVar3 = aVar10;
                    aVar4 = aVar9;
                    wx1Var4 = ey2Var.a;
                    if (ey2Var.b) {
                        arrayList5 = wx1Var4.r0;
                        i30 = 0;
                        while (i30 < size5) {
                            vx1 vx1Var19 = arrayList5.get(i30);
                            i30++;
                            vx1 vx1Var110 = vx1Var19;
                            vx1Var110.f();
                            vx1Var110.a = false;
                            ArrayList<vx1> arrayList16 = arrayList5;
                            o15 o15Var12 = vx1Var110.d;
                            o15Var12.e.j = false;
                            o15Var12.g = false;
                            o15Var12.n();
                            meb mebVar12 = vx1Var110.e;
                            mebVar12.e.j = false;
                            mebVar12.g = false;
                            mebVar12.m();
                            arrayList5 = arrayList16;
                        }
                        i28 = 0;
                        wx1Var4.f();
                        wx1Var4.a = false;
                        o15 o15Var13 = wx1Var4.d;
                        o15Var13.e.j = false;
                        o15Var13.g = false;
                        o15Var13.n();
                        meb mebVar13 = wx1Var4.e;
                        mebVar13.e.j = false;
                        mebVar13.g = false;
                        mebVar13.m();
                        ey2Var.c();
                    } else {
                        i28 = 0;
                    }
                    ey2Var.b(ey2Var.d);
                    wx1Var4.a0 = i28;
                    wx1Var4.b0 = i28;
                    wx1Var4.d.h.d(i28);
                    wx1Var4.e.h.d(i28);
                    i29 = 1073741824;
                    if (mode == 1073741824) {
                        zQ = wx1Var.Q(i28, zB);
                        i9 = 1;
                    } else {
                        i9 = 0;
                        zQ = true;
                    }
                    if (mode2 == 1073741824) {
                        zQ &= wx1Var.Q(1, zB);
                        i9++;
                    }
                } else {
                    z3 = z3;
                    wx1Var3 = wx1Var2;
                    arrayList2 = arrayList;
                    bVar = bVar;
                    aVar3 = aVar10;
                    aVar4 = aVar9;
                    wx1Var4 = ey2Var.a;
                    if (ey2Var.b) {
                        arrayList5 = wx1Var4.r0;
                        i30 = 0;
                        while (i30 < size5) {
                            vx1 vx1Var111 = arrayList5.get(i30);
                            i30++;
                            vx1 vx1Var112 = vx1Var111;
                            vx1Var112.f();
                            vx1Var112.a = false;
                            ArrayList<vx1> arrayList17 = arrayList5;
                            o15 o15Var14 = vx1Var112.d;
                            o15Var14.e.j = false;
                            o15Var14.g = false;
                            o15Var14.n();
                            meb mebVar14 = vx1Var112.e;
                            mebVar14.e.j = false;
                            mebVar14.g = false;
                            mebVar14.m();
                            arrayList5 = arrayList17;
                        }
                        i28 = 0;
                        wx1Var4.f();
                        wx1Var4.a = false;
                        o15 o15Var15 = wx1Var4.d;
                        o15Var15.e.j = false;
                        o15Var15.g = false;
                        o15Var15.n();
                        meb mebVar15 = wx1Var4.e;
                        mebVar15.e.j = false;
                        mebVar15.g = false;
                        mebVar15.m();
                        ey2Var.c();
                    } else {
                        i28 = 0;
                    }
                    ey2Var.b(ey2Var.d);
                    wx1Var4.a0 = i28;
                    wx1Var4.b0 = i28;
                    wx1Var4.d.h.d(i28);
                    wx1Var4.e.h.d(i28);
                    i29 = 1073741824;
                    if (mode == 1073741824) {
                        zQ = wx1Var.Q(i28, zB);
                        i9 = 1;
                    } else {
                        i9 = 0;
                        zQ = true;
                    }
                    if (mode2 == 1073741824) {
                        zQ &= wx1Var.Q(1, zB);
                        i9++;
                    }
                }
                if (zQ) {
                    if (mode == i29) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (mode2 == i29) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    wx1Var.L(z16, z17);
                }
            } else {
                z3 = z3;
                wx1Var3 = wx1Var2;
                arrayList2 = arrayList;
                bVar = bVar;
                aVar3 = aVar10;
                aVar4 = aVar9;
                i9 = 0;
                zQ = false;
            }
            if (zQ) {
            }
            i10 = wx1Var.E0;
            if (i8 > 0) {
                size3 = wx1Var.r0.size();
                boolean zS4 = wx1Var.S(64);
                bVar4 = wx1Var.v0;
                while (i24 < size3) {
                    vx1Var6 = wx1Var.r0.get(i24);
                    if (!(vx1Var6 instanceof vp4)) {
                        aVarH = vx1Var6.h(0);
                        aVarH2 = vx1Var6.h(1);
                        if (aVarH == aVar2) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            if (aVarH == aVar2) {
                                z14 = true;
                            }
                            if (aVarH2 == aVar2) {
                                z14 = true;
                            }
                            if (aVarH != aVar2) {
                            }
                        }
                        if (z14) {
                            ll0Var.a(0, bVar4, vx1Var6);
                        }
                    }
                }
                constraintLayout = ((b) bVar4).a;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.u;
                while (i25 < childCount) {
                    childAt = constraintLayout.getChildAt(i25);
                    if (childAt instanceof Placeholder) {
                        placeholder = (Placeholder) childAt;
                        if (placeholder.u == null) {
                            a aVar17 = (a) placeholder.getLayoutParams();
                            aVar8 = (a) placeholder.u.getLayoutParams();
                            vx1Var3 = aVar8.q0;
                            vx1Var3.i0 = 0;
                            vx1Var4 = aVar17.q0;
                            if (vx1Var4.U[0] != aVar3) {
                                vx1Var4.K(vx1Var3.o());
                            }
                            vx1Var5 = aVar17.q0;
                            if (vx1Var5.U[1] != aVar3) {
                                vx1Var5.H(aVar8.q0.i());
                            }
                            aVar8.q0.i0 = 8;
                        }
                    }
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i26 < size4) {
                        arrayList4.get(i26).getClass();
                    }
                }
            }
            ll0Var.c(wx1Var);
            size2 = arrayList2.size();
            if (i8 > 0) {
                ll0Var.b(wx1Var, 0, iO2, i7);
            }
            if (size2 > 0) {
                aVarArr = wx1Var.U;
                aVar5 = aVar4;
                if (aVarArr[0] == aVar5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (aVarArr[1] == aVar5) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                wx1 wx1Var9 = wx1Var3;
                iMax3 = Math.max(wx1Var.o(), wx1Var9.d0);
                iMax4 = Math.max(wx1Var.i(), wx1Var9.e0);
                i12 = 0;
                z6 = false;
                while (true) {
                    aVar6 = sx1.a.w;
                    aVar7 = sx1.a.v;
                    if (i12 < size2) {
                        break;
                        break;
                    }
                    ArrayList<vx1> arrayList18 = arrayList2;
                    vx1Var2 = arrayList18.get(i12);
                    z11 = z5;
                    if (vx1Var2 instanceof kjb) {
                        z12 = z4;
                        bVar3 = bVar;
                    } else {
                        iO5 = vx1Var2.o();
                        i22 = vx1Var2.i();
                        z12 = z4;
                        bVar3 = bVar;
                        zA2 = z6 | ll0Var.a(1, bVar3, vx1Var2);
                        iO6 = vx1Var2.o();
                        i23 = vx1Var2.i();
                        if (iO6 != iO5) {
                            vx1Var2.K(iO6);
                            if (z12) {
                                iMax3 = Math.max(iMax3, vx1Var2.g(aVar7).d() + vx1Var2.p() + vx1Var2.W);
                            }
                            z13 = true;
                        } else {
                            z13 = zA2;
                        }
                        if (i23 != i22) {
                            vx1Var2.H(i23);
                            if (z11) {
                                iMax4 = Math.max(iMax4, vx1Var2.g(aVar6).d() + vx1Var2.q() + vx1Var2.X);
                            }
                            z13 = true;
                        }
                        z6 = z13;
                    }
                    i12++;
                    z5 = z11;
                    bVar = bVar3;
                    arrayList2 = arrayList18;
                    i10 = i10;
                    z4 = z12;
                }
                int i415 = i10;
                z7 = z5;
                z8 = z4;
                z9 = z6;
                bVar2 = bVar;
                arrayList3 = arrayList2;
                i13 = 0;
                while (i13 < 2) {
                    i14 = 0;
                    while (i14 < size2) {
                        vx1Var = arrayList3.get(i14);
                        if (vx1Var instanceof dw4) {
                            if (vx1Var.i0 == 8) {
                                i18 = size2;
                                i20 = i13;
                                i19 = i14;
                            } else {
                                iO3 = vx1Var.o();
                                i17 = vx1Var.i();
                                i18 = size2;
                                int i416 = vx1Var.c0;
                                i19 = i14;
                                zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                                i20 = i13;
                                iO4 = vx1Var.o();
                                i21 = vx1Var.i();
                                if (iO4 != iO3) {
                                    vx1Var.K(iO4);
                                    if (z8) {
                                        iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                                    }
                                    z10 = true;
                                } else {
                                    z10 = zA;
                                }
                                if (i21 != i17) {
                                    vx1Var.H(i21);
                                    if (z7) {
                                        iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                                    }
                                    z10 = true;
                                }
                                if (vx1Var.E) {
                                    z9 = z10;
                                } else {
                                    z9 = z10;
                                }
                            }
                        } else if (vx1Var.i0 == 8) {
                            i18 = size2;
                            i20 = i13;
                            i19 = i14;
                        } else {
                            iO3 = vx1Var.o();
                            i17 = vx1Var.i();
                            i18 = size2;
                            int i417 = vx1Var.c0;
                            i19 = i14;
                            zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                            i20 = i13;
                            iO4 = vx1Var.o();
                            i21 = vx1Var.i();
                            if (iO4 != iO3) {
                                vx1Var.K(iO4);
                                if (z8) {
                                    iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                                }
                                z10 = true;
                            } else {
                                z10 = zA;
                            }
                            if (i21 != i17) {
                                vx1Var.H(i21);
                                if (z7) {
                                    iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                                }
                                z10 = true;
                            }
                            if (vx1Var.E) {
                                z9 = z10;
                            } else {
                                z9 = z10;
                            }
                        }
                        i14 = i19 + 1;
                        size2 = i18;
                        i13 = i20;
                    }
                    i15 = size2;
                    i16 = i13;
                    if (z9) {
                        break;
                        break;
                    }
                    i13 = i16 + 1;
                    ll0Var.b(wx1Var, i13, iO2, i7);
                    size2 = i15;
                    z9 = false;
                }
                i11 = i415;
            } else {
                i11 = i10;
            }
            wx1Var.E0 = i11;
            j86.q = wx1Var.S(512);
        }
        iMax = childCount2 == 0 ? Math.max(0, this.w) : i37;
        i4 = Integer.MIN_VALUE;
        if (mode2 != i4) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    aVar = aVar10;
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(this.z - i39, i38);
                    aVar = aVar10;
                }
            } else if (childCount2 == 0) {
                aVar = aVar9;
                iMax2 = Math.max(0, this.x);
            } else {
                iMax2 = 0;
            }
            iO = wx1Var.o();
            ey2Var = wx1Var.t0;
            iArr = wx1Var.C;
            if (iMax == iO) {
                ey2Var.c = true;
            } else {
                ey2Var.c = true;
            }
            wx1Var.a0 = 0;
            wx1Var.b0 = 0;
            iArr[0] = this.y - i40;
            iArr[1] = this.z - i39;
            wx1Var.d0 = 0;
            wx1Var.e0 = 0;
            wx1Var.I(aVar9);
            wx1Var.K(iMax);
            wx1Var.J(aVar);
            wx1Var.H(iMax2);
            i5 = this.w - i40;
            if (i5 < 0) {
                wx1Var.d0 = 0;
            } else {
                wx1Var.d0 = i5;
            }
            i6 = this.x - i39;
            if (i6 < 0) {
                wx1Var.e0 = 0;
            } else {
                wx1Var.e0 = i6;
            }
            wx1Var.y0 = iMax7;
            wx1Var.z0 = iMax5;
            ll0Var = wx1Var.s0;
            wx1Var2 = ll0Var.c;
            arrayList = ll0Var.a;
            bVar = wx1Var.v0;
            size = wx1Var.r0.size();
            iO2 = wx1Var.o();
            i7 = wx1Var.i();
            zB = lk7.b(i, 128);
            if (zB) {
                z = true;
            } else {
                z = true;
            }
            aVar2 = vx1.a.v;
            boolean z27 = z;
            if (z) {
                i34 = 0;
                while (true) {
                    i8 = size;
                    if (i34 < size) {
                        vx1Var7 = wx1Var.r0.get(i34);
                        i35 = i34;
                        aVarArr2 = vx1Var7.U;
                        if (aVarArr2[0] == aVar2) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (aVarArr2[1] == aVar2) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (z20) {
                            z22 = false;
                        } else {
                            z22 = false;
                        }
                        if (vx1Var7.v()) {
                            i34 = i35 + 1;
                            size = i8;
                        } else {
                            i34 = i35 + 1;
                            size = i8;
                        }
                        z2 = false;
                    }
                    z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
                    if (z3) {
                        iMin = Math.min(iArr[0], i37);
                        iMin2 = Math.min(iArr[1], i38);
                        i27 = 1073741824;
                        if (mode == 1073741824) {
                            if (wx1Var.o() != iMin) {
                                wx1Var.K(iMin);
                                z15 = true;
                                ey2Var.b = true;
                            } else {
                                z15 = true;
                            }
                            i27 = 1073741824;
                        } else {
                            z15 = true;
                        }
                        if (mode2 == i27) {
                            if (wx1Var.i() != iMin2) {
                                wx1Var.H(iMin2);
                                ey2Var.b = z15;
                            }
                            i27 = 1073741824;
                        }
                        if (mode == i27) {
                            z3 = z3;
                            wx1Var3 = wx1Var2;
                            arrayList2 = arrayList;
                            bVar = bVar;
                            aVar3 = aVar10;
                            aVar4 = aVar9;
                            wx1Var4 = ey2Var.a;
                            if (ey2Var.b) {
                                arrayList5 = wx1Var4.r0;
                                i30 = 0;
                                while (i30 < size5) {
                                    vx1 vx1Var113 = arrayList5.get(i30);
                                    i30++;
                                    vx1 vx1Var114 = vx1Var113;
                                    vx1Var114.f();
                                    vx1Var114.a = false;
                                    ArrayList<vx1> arrayList19 = arrayList5;
                                    o15 o15Var16 = vx1Var114.d;
                                    o15Var16.e.j = false;
                                    o15Var16.g = false;
                                    o15Var16.n();
                                    meb mebVar16 = vx1Var114.e;
                                    mebVar16.e.j = false;
                                    mebVar16.g = false;
                                    mebVar16.m();
                                    arrayList5 = arrayList19;
                                }
                                i28 = 0;
                                wx1Var4.f();
                                wx1Var4.a = false;
                                o15 o15Var17 = wx1Var4.d;
                                o15Var17.e.j = false;
                                o15Var17.g = false;
                                o15Var17.n();
                                meb mebVar17 = wx1Var4.e;
                                mebVar17.e.j = false;
                                mebVar17.g = false;
                                mebVar17.m();
                                ey2Var.c();
                            } else {
                                i28 = 0;
                            }
                            ey2Var.b(ey2Var.d);
                            wx1Var4.a0 = i28;
                            wx1Var4.b0 = i28;
                            wx1Var4.d.h.d(i28);
                            wx1Var4.e.h.d(i28);
                            i29 = 1073741824;
                            if (mode == 1073741824) {
                                zQ = wx1Var.Q(i28, zB);
                                i9 = 1;
                            } else {
                                i9 = 0;
                                zQ = true;
                            }
                            if (mode2 == 1073741824) {
                                zQ &= wx1Var.Q(1, zB);
                                i9++;
                            }
                        } else {
                            z3 = z3;
                            wx1Var3 = wx1Var2;
                            arrayList2 = arrayList;
                            bVar = bVar;
                            aVar3 = aVar10;
                            aVar4 = aVar9;
                            wx1Var4 = ey2Var.a;
                            if (ey2Var.b) {
                                arrayList5 = wx1Var4.r0;
                                i30 = 0;
                                while (i30 < size5) {
                                    vx1 vx1Var115 = arrayList5.get(i30);
                                    i30++;
                                    vx1 vx1Var116 = vx1Var115;
                                    vx1Var116.f();
                                    vx1Var116.a = false;
                                    ArrayList<vx1> arrayList110 = arrayList5;
                                    o15 o15Var18 = vx1Var116.d;
                                    o15Var18.e.j = false;
                                    o15Var18.g = false;
                                    o15Var18.n();
                                    meb mebVar18 = vx1Var116.e;
                                    mebVar18.e.j = false;
                                    mebVar18.g = false;
                                    mebVar18.m();
                                    arrayList5 = arrayList110;
                                }
                                i28 = 0;
                                wx1Var4.f();
                                wx1Var4.a = false;
                                o15 o15Var19 = wx1Var4.d;
                                o15Var19.e.j = false;
                                o15Var19.g = false;
                                o15Var19.n();
                                meb mebVar19 = wx1Var4.e;
                                mebVar19.e.j = false;
                                mebVar19.g = false;
                                mebVar19.m();
                                ey2Var.c();
                            } else {
                                i28 = 0;
                            }
                            ey2Var.b(ey2Var.d);
                            wx1Var4.a0 = i28;
                            wx1Var4.b0 = i28;
                            wx1Var4.d.h.d(i28);
                            wx1Var4.e.h.d(i28);
                            i29 = 1073741824;
                            if (mode == 1073741824) {
                                zQ = wx1Var.Q(i28, zB);
                                i9 = 1;
                            } else {
                                i9 = 0;
                                zQ = true;
                            }
                            if (mode2 == 1073741824) {
                                zQ &= wx1Var.Q(1, zB);
                                i9++;
                            }
                        }
                        if (zQ) {
                            if (mode == i29) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (mode2 == i29) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            wx1Var.L(z16, z17);
                        }
                    } else {
                        z3 = z3;
                        wx1Var3 = wx1Var2;
                        arrayList2 = arrayList;
                        bVar = bVar;
                        aVar3 = aVar10;
                        aVar4 = aVar9;
                        i9 = 0;
                        zQ = false;
                    }
                    if (zQ) {
                    }
                    i10 = wx1Var.E0;
                    if (i8 > 0) {
                        size3 = wx1Var.r0.size();
                        boolean zS5 = wx1Var.S(64);
                        bVar4 = wx1Var.v0;
                        while (i24 < size3) {
                            vx1Var6 = wx1Var.r0.get(i24);
                            if (!(vx1Var6 instanceof vp4)) {
                                aVarH = vx1Var6.h(0);
                                aVarH2 = vx1Var6.h(1);
                                if (aVarH == aVar2) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                if (!z14) {
                                    if (aVarH == aVar2) {
                                        z14 = true;
                                    }
                                    if (aVarH2 == aVar2) {
                                        z14 = true;
                                    }
                                    if (aVarH != aVar2) {
                                    }
                                }
                                if (z14) {
                                    ll0Var.a(0, bVar4, vx1Var6);
                                }
                            }
                        }
                        constraintLayout = ((b) bVar4).a;
                        childCount = constraintLayout.getChildCount();
                        arrayList4 = constraintLayout.u;
                        while (i25 < childCount) {
                            childAt = constraintLayout.getChildAt(i25);
                            if (childAt instanceof Placeholder) {
                                placeholder = (Placeholder) childAt;
                                if (placeholder.u == null) {
                                    a aVar18 = (a) placeholder.getLayoutParams();
                                    aVar8 = (a) placeholder.u.getLayoutParams();
                                    vx1Var3 = aVar8.q0;
                                    vx1Var3.i0 = 0;
                                    vx1Var4 = aVar18.q0;
                                    if (vx1Var4.U[0] != aVar3) {
                                        vx1Var4.K(vx1Var3.o());
                                    }
                                    vx1Var5 = aVar18.q0;
                                    if (vx1Var5.U[1] != aVar3) {
                                        vx1Var5.H(aVar8.q0.i());
                                    }
                                    aVar8.q0.i0 = 8;
                                }
                            }
                        }
                        size4 = arrayList4.size();
                        if (size4 > 0) {
                            while (i26 < size4) {
                                arrayList4.get(i26).getClass();
                            }
                        }
                    }
                    ll0Var.c(wx1Var);
                    size2 = arrayList2.size();
                    if (i8 > 0) {
                        ll0Var.b(wx1Var, 0, iO2, i7);
                    }
                    if (size2 > 0) {
                        aVarArr = wx1Var.U;
                        aVar5 = aVar4;
                        if (aVarArr[0] == aVar5) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (aVarArr[1] == aVar5) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        wx1 wx1Var10 = wx1Var3;
                        iMax3 = Math.max(wx1Var.o(), wx1Var10.d0);
                        iMax4 = Math.max(wx1Var.i(), wx1Var10.e0);
                        i12 = 0;
                        z6 = false;
                        while (true) {
                            aVar6 = sx1.a.w;
                            aVar7 = sx1.a.v;
                            if (i12 < size2) {
                                break;
                                break;
                            }
                            ArrayList<vx1> arrayList111 = arrayList2;
                            vx1Var2 = arrayList111.get(i12);
                            z11 = z5;
                            if (vx1Var2 instanceof kjb) {
                                z12 = z4;
                                bVar3 = bVar;
                            } else {
                                iO5 = vx1Var2.o();
                                i22 = vx1Var2.i();
                                z12 = z4;
                                bVar3 = bVar;
                                zA2 = z6 | ll0Var.a(1, bVar3, vx1Var2);
                                iO6 = vx1Var2.o();
                                i23 = vx1Var2.i();
                                if (iO6 != iO5) {
                                    vx1Var2.K(iO6);
                                    if (z12) {
                                        iMax3 = Math.max(iMax3, vx1Var2.g(aVar7).d() + vx1Var2.p() + vx1Var2.W);
                                    }
                                    z13 = true;
                                } else {
                                    z13 = zA2;
                                }
                                if (i23 != i22) {
                                    vx1Var2.H(i23);
                                    if (z11) {
                                        iMax4 = Math.max(iMax4, vx1Var2.g(aVar6).d() + vx1Var2.q() + vx1Var2.X);
                                    }
                                    z13 = true;
                                }
                                z6 = z13;
                            }
                            i12++;
                            z5 = z11;
                            bVar = bVar3;
                            arrayList2 = arrayList111;
                            i10 = i10;
                            z4 = z12;
                        }
                        int i418 = i10;
                        z7 = z5;
                        z8 = z4;
                        z9 = z6;
                        bVar2 = bVar;
                        arrayList3 = arrayList2;
                        i13 = 0;
                        while (i13 < 2) {
                            i14 = 0;
                            while (i14 < size2) {
                                vx1Var = arrayList3.get(i14);
                                if (vx1Var instanceof dw4) {
                                    if (vx1Var.i0 == 8) {
                                        i18 = size2;
                                        i20 = i13;
                                        i19 = i14;
                                    } else {
                                        iO3 = vx1Var.o();
                                        i17 = vx1Var.i();
                                        i18 = size2;
                                        int i419 = vx1Var.c0;
                                        i19 = i14;
                                        zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                                        i20 = i13;
                                        iO4 = vx1Var.o();
                                        i21 = vx1Var.i();
                                        if (iO4 != iO3) {
                                            vx1Var.K(iO4);
                                            if (z8) {
                                                iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                                            }
                                            z10 = true;
                                        } else {
                                            z10 = zA;
                                        }
                                        if (i21 != i17) {
                                            vx1Var.H(i21);
                                            if (z7) {
                                                iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                                            }
                                            z10 = true;
                                        }
                                        if (vx1Var.E) {
                                            z9 = z10;
                                        } else {
                                            z9 = z10;
                                        }
                                    }
                                } else if (vx1Var.i0 == 8) {
                                    i18 = size2;
                                    i20 = i13;
                                    i19 = i14;
                                } else {
                                    iO3 = vx1Var.o();
                                    i17 = vx1Var.i();
                                    i18 = size2;
                                    int i4110 = vx1Var.c0;
                                    i19 = i14;
                                    zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                                    i20 = i13;
                                    iO4 = vx1Var.o();
                                    i21 = vx1Var.i();
                                    if (iO4 != iO3) {
                                        vx1Var.K(iO4);
                                        if (z8) {
                                            iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                                        }
                                        z10 = true;
                                    } else {
                                        z10 = zA;
                                    }
                                    if (i21 != i17) {
                                        vx1Var.H(i21);
                                        if (z7) {
                                            iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                                        }
                                        z10 = true;
                                    }
                                    if (vx1Var.E) {
                                        z9 = z10;
                                    } else {
                                        z9 = z10;
                                    }
                                }
                                i14 = i19 + 1;
                                size2 = i18;
                                i13 = i20;
                            }
                            i15 = size2;
                            i16 = i13;
                            if (z9) {
                                break;
                                break;
                            }
                            i13 = i16 + 1;
                            ll0Var.b(wx1Var, i13, iO2, i7);
                            size2 = i15;
                            z9 = false;
                        }
                        i11 = i418;
                    } else {
                        i11 = i10;
                    }
                    wx1Var.E0 = i11;
                    j86.q = wx1Var.S(512);
                }
            }
            i8 = size;
            z2 = z27;
            z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
            if (z3) {
                iMin = Math.min(iArr[0], i37);
                iMin2 = Math.min(iArr[1], i38);
                i27 = 1073741824;
                if (mode == 1073741824) {
                    if (wx1Var.o() != iMin) {
                        wx1Var.K(iMin);
                        z15 = true;
                        ey2Var.b = true;
                    } else {
                        z15 = true;
                    }
                    i27 = 1073741824;
                } else {
                    z15 = true;
                }
                if (mode2 == i27) {
                    if (wx1Var.i() != iMin2) {
                        wx1Var.H(iMin2);
                        ey2Var.b = z15;
                    }
                    i27 = 1073741824;
                }
                if (mode == i27) {
                    z3 = z3;
                    wx1Var3 = wx1Var2;
                    arrayList2 = arrayList;
                    bVar = bVar;
                    aVar3 = aVar10;
                    aVar4 = aVar9;
                    wx1Var4 = ey2Var.a;
                    if (ey2Var.b) {
                        arrayList5 = wx1Var4.r0;
                        i30 = 0;
                        while (i30 < size5) {
                            vx1 vx1Var117 = arrayList5.get(i30);
                            i30++;
                            vx1 vx1Var118 = vx1Var117;
                            vx1Var118.f();
                            vx1Var118.a = false;
                            ArrayList<vx1> arrayList112 = arrayList5;
                            o15 o15Var110 = vx1Var118.d;
                            o15Var110.e.j = false;
                            o15Var110.g = false;
                            o15Var110.n();
                            meb mebVar110 = vx1Var118.e;
                            mebVar110.e.j = false;
                            mebVar110.g = false;
                            mebVar110.m();
                            arrayList5 = arrayList112;
                        }
                        i28 = 0;
                        wx1Var4.f();
                        wx1Var4.a = false;
                        o15 o15Var111 = wx1Var4.d;
                        o15Var111.e.j = false;
                        o15Var111.g = false;
                        o15Var111.n();
                        meb mebVar111 = wx1Var4.e;
                        mebVar111.e.j = false;
                        mebVar111.g = false;
                        mebVar111.m();
                        ey2Var.c();
                    } else {
                        i28 = 0;
                    }
                    ey2Var.b(ey2Var.d);
                    wx1Var4.a0 = i28;
                    wx1Var4.b0 = i28;
                    wx1Var4.d.h.d(i28);
                    wx1Var4.e.h.d(i28);
                    i29 = 1073741824;
                    if (mode == 1073741824) {
                        zQ = wx1Var.Q(i28, zB);
                        i9 = 1;
                    } else {
                        i9 = 0;
                        zQ = true;
                    }
                    if (mode2 == 1073741824) {
                        zQ &= wx1Var.Q(1, zB);
                        i9++;
                    }
                } else {
                    z3 = z3;
                    wx1Var3 = wx1Var2;
                    arrayList2 = arrayList;
                    bVar = bVar;
                    aVar3 = aVar10;
                    aVar4 = aVar9;
                    wx1Var4 = ey2Var.a;
                    if (ey2Var.b) {
                        arrayList5 = wx1Var4.r0;
                        i30 = 0;
                        while (i30 < size5) {
                            vx1 vx1Var119 = arrayList5.get(i30);
                            i30++;
                            vx1 vx1Var1110 = vx1Var119;
                            vx1Var1110.f();
                            vx1Var1110.a = false;
                            ArrayList<vx1> arrayList113 = arrayList5;
                            o15 o15Var112 = vx1Var1110.d;
                            o15Var112.e.j = false;
                            o15Var112.g = false;
                            o15Var112.n();
                            meb mebVar112 = vx1Var1110.e;
                            mebVar112.e.j = false;
                            mebVar112.g = false;
                            mebVar112.m();
                            arrayList5 = arrayList113;
                        }
                        i28 = 0;
                        wx1Var4.f();
                        wx1Var4.a = false;
                        o15 o15Var113 = wx1Var4.d;
                        o15Var113.e.j = false;
                        o15Var113.g = false;
                        o15Var113.n();
                        meb mebVar113 = wx1Var4.e;
                        mebVar113.e.j = false;
                        mebVar113.g = false;
                        mebVar113.m();
                        ey2Var.c();
                    } else {
                        i28 = 0;
                    }
                    ey2Var.b(ey2Var.d);
                    wx1Var4.a0 = i28;
                    wx1Var4.b0 = i28;
                    wx1Var4.d.h.d(i28);
                    wx1Var4.e.h.d(i28);
                    i29 = 1073741824;
                    if (mode == 1073741824) {
                        zQ = wx1Var.Q(i28, zB);
                        i9 = 1;
                    } else {
                        i9 = 0;
                        zQ = true;
                    }
                    if (mode2 == 1073741824) {
                        zQ &= wx1Var.Q(1, zB);
                        i9++;
                    }
                }
                if (zQ) {
                    if (mode == i29) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (mode2 == i29) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    wx1Var.L(z16, z17);
                }
            } else {
                z3 = z3;
                wx1Var3 = wx1Var2;
                arrayList2 = arrayList;
                bVar = bVar;
                aVar3 = aVar10;
                aVar4 = aVar9;
                i9 = 0;
                zQ = false;
            }
            if (zQ) {
            }
            i10 = wx1Var.E0;
            if (i8 > 0) {
                size3 = wx1Var.r0.size();
                boolean zS6 = wx1Var.S(64);
                bVar4 = wx1Var.v0;
                while (i24 < size3) {
                    vx1Var6 = wx1Var.r0.get(i24);
                    if (!(vx1Var6 instanceof vp4)) {
                        aVarH = vx1Var6.h(0);
                        aVarH2 = vx1Var6.h(1);
                        if (aVarH == aVar2) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            if (aVarH == aVar2) {
                                z14 = true;
                            }
                            if (aVarH2 == aVar2) {
                                z14 = true;
                            }
                            if (aVarH != aVar2) {
                            }
                        }
                        if (z14) {
                            ll0Var.a(0, bVar4, vx1Var6);
                        }
                    }
                }
                constraintLayout = ((b) bVar4).a;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.u;
                while (i25 < childCount) {
                    childAt = constraintLayout.getChildAt(i25);
                    if (childAt instanceof Placeholder) {
                        placeholder = (Placeholder) childAt;
                        if (placeholder.u == null) {
                            a aVar19 = (a) placeholder.getLayoutParams();
                            aVar8 = (a) placeholder.u.getLayoutParams();
                            vx1Var3 = aVar8.q0;
                            vx1Var3.i0 = 0;
                            vx1Var4 = aVar19.q0;
                            if (vx1Var4.U[0] != aVar3) {
                                vx1Var4.K(vx1Var3.o());
                            }
                            vx1Var5 = aVar19.q0;
                            if (vx1Var5.U[1] != aVar3) {
                                vx1Var5.H(aVar8.q0.i());
                            }
                            aVar8.q0.i0 = 8;
                        }
                    }
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i26 < size4) {
                        arrayList4.get(i26).getClass();
                    }
                }
            }
            ll0Var.c(wx1Var);
            size2 = arrayList2.size();
            if (i8 > 0) {
                ll0Var.b(wx1Var, 0, iO2, i7);
            }
            if (size2 > 0) {
                aVarArr = wx1Var.U;
                aVar5 = aVar4;
                if (aVarArr[0] == aVar5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (aVarArr[1] == aVar5) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                wx1 wx1Var11 = wx1Var3;
                iMax3 = Math.max(wx1Var.o(), wx1Var11.d0);
                iMax4 = Math.max(wx1Var.i(), wx1Var11.e0);
                i12 = 0;
                z6 = false;
                while (true) {
                    aVar6 = sx1.a.w;
                    aVar7 = sx1.a.v;
                    if (i12 < size2) {
                        break;
                        break;
                    }
                    ArrayList<vx1> arrayList114 = arrayList2;
                    vx1Var2 = arrayList114.get(i12);
                    z11 = z5;
                    if (vx1Var2 instanceof kjb) {
                        z12 = z4;
                        bVar3 = bVar;
                    } else {
                        iO5 = vx1Var2.o();
                        i22 = vx1Var2.i();
                        z12 = z4;
                        bVar3 = bVar;
                        zA2 = z6 | ll0Var.a(1, bVar3, vx1Var2);
                        iO6 = vx1Var2.o();
                        i23 = vx1Var2.i();
                        if (iO6 != iO5) {
                            vx1Var2.K(iO6);
                            if (z12) {
                                iMax3 = Math.max(iMax3, vx1Var2.g(aVar7).d() + vx1Var2.p() + vx1Var2.W);
                            }
                            z13 = true;
                        } else {
                            z13 = zA2;
                        }
                        if (i23 != i22) {
                            vx1Var2.H(i23);
                            if (z11) {
                                iMax4 = Math.max(iMax4, vx1Var2.g(aVar6).d() + vx1Var2.q() + vx1Var2.X);
                            }
                            z13 = true;
                        }
                        z6 = z13;
                    }
                    i12++;
                    z5 = z11;
                    bVar = bVar3;
                    arrayList2 = arrayList114;
                    i10 = i10;
                    z4 = z12;
                }
                int i4111 = i10;
                z7 = z5;
                z8 = z4;
                z9 = z6;
                bVar2 = bVar;
                arrayList3 = arrayList2;
                i13 = 0;
                while (i13 < 2) {
                    i14 = 0;
                    while (i14 < size2) {
                        vx1Var = arrayList3.get(i14);
                        if (vx1Var instanceof dw4) {
                            if (vx1Var.i0 == 8) {
                                i18 = size2;
                                i20 = i13;
                                i19 = i14;
                            } else {
                                iO3 = vx1Var.o();
                                i17 = vx1Var.i();
                                i18 = size2;
                                int i4112 = vx1Var.c0;
                                i19 = i14;
                                zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                                i20 = i13;
                                iO4 = vx1Var.o();
                                i21 = vx1Var.i();
                                if (iO4 != iO3) {
                                    vx1Var.K(iO4);
                                    if (z8) {
                                        iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                                    }
                                    z10 = true;
                                } else {
                                    z10 = zA;
                                }
                                if (i21 != i17) {
                                    vx1Var.H(i21);
                                    if (z7) {
                                        iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                                    }
                                    z10 = true;
                                }
                                if (vx1Var.E) {
                                    z9 = z10;
                                } else {
                                    z9 = z10;
                                }
                            }
                        } else if (vx1Var.i0 == 8) {
                            i18 = size2;
                            i20 = i13;
                            i19 = i14;
                        } else {
                            iO3 = vx1Var.o();
                            i17 = vx1Var.i();
                            i18 = size2;
                            int i4113 = vx1Var.c0;
                            i19 = i14;
                            zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                            i20 = i13;
                            iO4 = vx1Var.o();
                            i21 = vx1Var.i();
                            if (iO4 != iO3) {
                                vx1Var.K(iO4);
                                if (z8) {
                                    iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                                }
                                z10 = true;
                            } else {
                                z10 = zA;
                            }
                            if (i21 != i17) {
                                vx1Var.H(i21);
                                if (z7) {
                                    iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                                }
                                z10 = true;
                            }
                            if (vx1Var.E) {
                                z9 = z10;
                            } else {
                                z9 = z10;
                            }
                        }
                        i14 = i19 + 1;
                        size2 = i18;
                        i13 = i20;
                    }
                    i15 = size2;
                    i16 = i13;
                    if (z9) {
                        break;
                        break;
                    }
                    i13 = i16 + 1;
                    ll0Var.b(wx1Var, i13, iO2, i7);
                    size2 = i15;
                    z9 = false;
                }
                i11 = i4111;
            } else {
                i11 = i10;
            }
            wx1Var.E0 = i11;
            j86.q = wx1Var.S(512);
        }
        if (childCount2 == 0) {
            iMax2 = Math.max(0, this.x);
        } else {
            iMax2 = i38;
        }
        aVar = aVar9;
        iO = wx1Var.o();
        ey2Var = wx1Var.t0;
        iArr = wx1Var.C;
        if (iMax == iO) {
            ey2Var.c = true;
        } else {
            ey2Var.c = true;
        }
        wx1Var.a0 = 0;
        wx1Var.b0 = 0;
        iArr[0] = this.y - i40;
        iArr[1] = this.z - i39;
        wx1Var.d0 = 0;
        wx1Var.e0 = 0;
        wx1Var.I(aVar9);
        wx1Var.K(iMax);
        wx1Var.J(aVar);
        wx1Var.H(iMax2);
        i5 = this.w - i40;
        if (i5 < 0) {
            wx1Var.d0 = 0;
        } else {
            wx1Var.d0 = i5;
        }
        i6 = this.x - i39;
        if (i6 < 0) {
            wx1Var.e0 = 0;
        } else {
            wx1Var.e0 = i6;
        }
        wx1Var.y0 = iMax7;
        wx1Var.z0 = iMax5;
        ll0Var = wx1Var.s0;
        wx1Var2 = ll0Var.c;
        arrayList = ll0Var.a;
        bVar = wx1Var.v0;
        size = wx1Var.r0.size();
        iO2 = wx1Var.o();
        i7 = wx1Var.i();
        zB = lk7.b(i, 128);
        if (zB) {
            z = true;
        } else {
            z = true;
        }
        aVar2 = vx1.a.v;
        boolean z28 = z;
        if (z) {
            i34 = 0;
            while (true) {
                i8 = size;
                if (i34 < size) {
                    vx1Var7 = wx1Var.r0.get(i34);
                    i35 = i34;
                    aVarArr2 = vx1Var7.U;
                    if (aVarArr2[0] == aVar2) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (aVarArr2[1] == aVar2) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (z20) {
                        z22 = false;
                    } else {
                        z22 = false;
                    }
                    if (vx1Var7.v()) {
                        i34 = i35 + 1;
                        size = i8;
                    } else {
                        i34 = i35 + 1;
                        size = i8;
                    }
                    z2 = false;
                }
                z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
                if (z3) {
                    iMin = Math.min(iArr[0], i37);
                    iMin2 = Math.min(iArr[1], i38);
                    i27 = 1073741824;
                    if (mode == 1073741824) {
                        if (wx1Var.o() != iMin) {
                            wx1Var.K(iMin);
                            z15 = true;
                            ey2Var.b = true;
                        } else {
                            z15 = true;
                        }
                        i27 = 1073741824;
                    } else {
                        z15 = true;
                    }
                    if (mode2 == i27) {
                        if (wx1Var.i() != iMin2) {
                            wx1Var.H(iMin2);
                            ey2Var.b = z15;
                        }
                        i27 = 1073741824;
                    }
                    if (mode == i27) {
                        z3 = z3;
                        wx1Var3 = wx1Var2;
                        arrayList2 = arrayList;
                        bVar = bVar;
                        aVar3 = aVar10;
                        aVar4 = aVar9;
                        wx1Var4 = ey2Var.a;
                        if (ey2Var.b) {
                            arrayList5 = wx1Var4.r0;
                            i30 = 0;
                            while (i30 < size5) {
                                vx1 vx1Var1111 = arrayList5.get(i30);
                                i30++;
                                vx1 vx1Var1112 = vx1Var1111;
                                vx1Var1112.f();
                                vx1Var1112.a = false;
                                ArrayList<vx1> arrayList115 = arrayList5;
                                o15 o15Var114 = vx1Var1112.d;
                                o15Var114.e.j = false;
                                o15Var114.g = false;
                                o15Var114.n();
                                meb mebVar114 = vx1Var1112.e;
                                mebVar114.e.j = false;
                                mebVar114.g = false;
                                mebVar114.m();
                                arrayList5 = arrayList115;
                            }
                            i28 = 0;
                            wx1Var4.f();
                            wx1Var4.a = false;
                            o15 o15Var115 = wx1Var4.d;
                            o15Var115.e.j = false;
                            o15Var115.g = false;
                            o15Var115.n();
                            meb mebVar115 = wx1Var4.e;
                            mebVar115.e.j = false;
                            mebVar115.g = false;
                            mebVar115.m();
                            ey2Var.c();
                        } else {
                            i28 = 0;
                        }
                        ey2Var.b(ey2Var.d);
                        wx1Var4.a0 = i28;
                        wx1Var4.b0 = i28;
                        wx1Var4.d.h.d(i28);
                        wx1Var4.e.h.d(i28);
                        i29 = 1073741824;
                        if (mode == 1073741824) {
                            zQ = wx1Var.Q(i28, zB);
                            i9 = 1;
                        } else {
                            i9 = 0;
                            zQ = true;
                        }
                        if (mode2 == 1073741824) {
                            zQ &= wx1Var.Q(1, zB);
                            i9++;
                        }
                    } else {
                        z3 = z3;
                        wx1Var3 = wx1Var2;
                        arrayList2 = arrayList;
                        bVar = bVar;
                        aVar3 = aVar10;
                        aVar4 = aVar9;
                        wx1Var4 = ey2Var.a;
                        if (ey2Var.b) {
                            arrayList5 = wx1Var4.r0;
                            i30 = 0;
                            while (i30 < size5) {
                                vx1 vx1Var1113 = arrayList5.get(i30);
                                i30++;
                                vx1 vx1Var1114 = vx1Var1113;
                                vx1Var1114.f();
                                vx1Var1114.a = false;
                                ArrayList<vx1> arrayList116 = arrayList5;
                                o15 o15Var116 = vx1Var1114.d;
                                o15Var116.e.j = false;
                                o15Var116.g = false;
                                o15Var116.n();
                                meb mebVar116 = vx1Var1114.e;
                                mebVar116.e.j = false;
                                mebVar116.g = false;
                                mebVar116.m();
                                arrayList5 = arrayList116;
                            }
                            i28 = 0;
                            wx1Var4.f();
                            wx1Var4.a = false;
                            o15 o15Var117 = wx1Var4.d;
                            o15Var117.e.j = false;
                            o15Var117.g = false;
                            o15Var117.n();
                            meb mebVar117 = wx1Var4.e;
                            mebVar117.e.j = false;
                            mebVar117.g = false;
                            mebVar117.m();
                            ey2Var.c();
                        } else {
                            i28 = 0;
                        }
                        ey2Var.b(ey2Var.d);
                        wx1Var4.a0 = i28;
                        wx1Var4.b0 = i28;
                        wx1Var4.d.h.d(i28);
                        wx1Var4.e.h.d(i28);
                        i29 = 1073741824;
                        if (mode == 1073741824) {
                            zQ = wx1Var.Q(i28, zB);
                            i9 = 1;
                        } else {
                            i9 = 0;
                            zQ = true;
                        }
                        if (mode2 == 1073741824) {
                            zQ &= wx1Var.Q(1, zB);
                            i9++;
                        }
                    }
                    if (zQ) {
                        if (mode == i29) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (mode2 == i29) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        wx1Var.L(z16, z17);
                    }
                } else {
                    z3 = z3;
                    wx1Var3 = wx1Var2;
                    arrayList2 = arrayList;
                    bVar = bVar;
                    aVar3 = aVar10;
                    aVar4 = aVar9;
                    i9 = 0;
                    zQ = false;
                }
                if (zQ) {
                }
                i10 = wx1Var.E0;
                if (i8 > 0) {
                    size3 = wx1Var.r0.size();
                    boolean zS7 = wx1Var.S(64);
                    bVar4 = wx1Var.v0;
                    while (i24 < size3) {
                        vx1Var6 = wx1Var.r0.get(i24);
                        if (!(vx1Var6 instanceof vp4)) {
                            aVarH = vx1Var6.h(0);
                            aVarH2 = vx1Var6.h(1);
                            if (aVarH == aVar2) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                if (aVarH == aVar2) {
                                    z14 = true;
                                }
                                if (aVarH2 == aVar2) {
                                    z14 = true;
                                }
                                if (aVarH != aVar2) {
                                }
                            }
                            if (z14) {
                                ll0Var.a(0, bVar4, vx1Var6);
                            }
                        }
                    }
                    constraintLayout = ((b) bVar4).a;
                    childCount = constraintLayout.getChildCount();
                    arrayList4 = constraintLayout.u;
                    while (i25 < childCount) {
                        childAt = constraintLayout.getChildAt(i25);
                        if (childAt instanceof Placeholder) {
                            placeholder = (Placeholder) childAt;
                            if (placeholder.u == null) {
                                a aVar110 = (a) placeholder.getLayoutParams();
                                aVar8 = (a) placeholder.u.getLayoutParams();
                                vx1Var3 = aVar8.q0;
                                vx1Var3.i0 = 0;
                                vx1Var4 = aVar110.q0;
                                if (vx1Var4.U[0] != aVar3) {
                                    vx1Var4.K(vx1Var3.o());
                                }
                                vx1Var5 = aVar110.q0;
                                if (vx1Var5.U[1] != aVar3) {
                                    vx1Var5.H(aVar8.q0.i());
                                }
                                aVar8.q0.i0 = 8;
                            }
                        }
                    }
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        while (i26 < size4) {
                            arrayList4.get(i26).getClass();
                        }
                    }
                }
                ll0Var.c(wx1Var);
                size2 = arrayList2.size();
                if (i8 > 0) {
                    ll0Var.b(wx1Var, 0, iO2, i7);
                }
                if (size2 > 0) {
                    aVarArr = wx1Var.U;
                    aVar5 = aVar4;
                    if (aVarArr[0] == aVar5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (aVarArr[1] == aVar5) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    wx1 wx1Var12 = wx1Var3;
                    iMax3 = Math.max(wx1Var.o(), wx1Var12.d0);
                    iMax4 = Math.max(wx1Var.i(), wx1Var12.e0);
                    i12 = 0;
                    z6 = false;
                    while (true) {
                        aVar6 = sx1.a.w;
                        aVar7 = sx1.a.v;
                        if (i12 < size2) {
                            break;
                            break;
                        }
                        ArrayList<vx1> arrayList117 = arrayList2;
                        vx1Var2 = arrayList117.get(i12);
                        z11 = z5;
                        if (vx1Var2 instanceof kjb) {
                            z12 = z4;
                            bVar3 = bVar;
                        } else {
                            iO5 = vx1Var2.o();
                            i22 = vx1Var2.i();
                            z12 = z4;
                            bVar3 = bVar;
                            zA2 = z6 | ll0Var.a(1, bVar3, vx1Var2);
                            iO6 = vx1Var2.o();
                            i23 = vx1Var2.i();
                            if (iO6 != iO5) {
                                vx1Var2.K(iO6);
                                if (z12) {
                                    iMax3 = Math.max(iMax3, vx1Var2.g(aVar7).d() + vx1Var2.p() + vx1Var2.W);
                                }
                                z13 = true;
                            } else {
                                z13 = zA2;
                            }
                            if (i23 != i22) {
                                vx1Var2.H(i23);
                                if (z11) {
                                    iMax4 = Math.max(iMax4, vx1Var2.g(aVar6).d() + vx1Var2.q() + vx1Var2.X);
                                }
                                z13 = true;
                            }
                            z6 = z13;
                        }
                        i12++;
                        z5 = z11;
                        bVar = bVar3;
                        arrayList2 = arrayList117;
                        i10 = i10;
                        z4 = z12;
                    }
                    int i4114 = i10;
                    z7 = z5;
                    z8 = z4;
                    z9 = z6;
                    bVar2 = bVar;
                    arrayList3 = arrayList2;
                    i13 = 0;
                    while (i13 < 2) {
                        i14 = 0;
                        while (i14 < size2) {
                            vx1Var = arrayList3.get(i14);
                            if (vx1Var instanceof dw4) {
                                if (vx1Var.i0 == 8) {
                                    i18 = size2;
                                    i20 = i13;
                                    i19 = i14;
                                } else {
                                    iO3 = vx1Var.o();
                                    i17 = vx1Var.i();
                                    i18 = size2;
                                    int i4115 = vx1Var.c0;
                                    i19 = i14;
                                    zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                                    i20 = i13;
                                    iO4 = vx1Var.o();
                                    i21 = vx1Var.i();
                                    if (iO4 != iO3) {
                                        vx1Var.K(iO4);
                                        if (z8) {
                                            iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                                        }
                                        z10 = true;
                                    } else {
                                        z10 = zA;
                                    }
                                    if (i21 != i17) {
                                        vx1Var.H(i21);
                                        if (z7) {
                                            iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                                        }
                                        z10 = true;
                                    }
                                    if (vx1Var.E) {
                                        z9 = z10;
                                    } else {
                                        z9 = z10;
                                    }
                                }
                            } else if (vx1Var.i0 == 8) {
                                i18 = size2;
                                i20 = i13;
                                i19 = i14;
                            } else {
                                iO3 = vx1Var.o();
                                i17 = vx1Var.i();
                                i18 = size2;
                                int i4116 = vx1Var.c0;
                                i19 = i14;
                                zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                                i20 = i13;
                                iO4 = vx1Var.o();
                                i21 = vx1Var.i();
                                if (iO4 != iO3) {
                                    vx1Var.K(iO4);
                                    if (z8) {
                                        iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                                    }
                                    z10 = true;
                                } else {
                                    z10 = zA;
                                }
                                if (i21 != i17) {
                                    vx1Var.H(i21);
                                    if (z7) {
                                        iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                                    }
                                    z10 = true;
                                }
                                if (vx1Var.E) {
                                    z9 = z10;
                                } else {
                                    z9 = z10;
                                }
                            }
                            i14 = i19 + 1;
                            size2 = i18;
                            i13 = i20;
                        }
                        i15 = size2;
                        i16 = i13;
                        if (z9) {
                            break;
                            break;
                        }
                        i13 = i16 + 1;
                        ll0Var.b(wx1Var, i13, iO2, i7);
                        size2 = i15;
                        z9 = false;
                    }
                    i11 = i4114;
                } else {
                    i11 = i10;
                }
                wx1Var.E0 = i11;
                j86.q = wx1Var.S(512);
            }
        }
        i8 = size;
        z2 = z28;
        z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
        if (z3) {
            iMin = Math.min(iArr[0], i37);
            iMin2 = Math.min(iArr[1], i38);
            i27 = 1073741824;
            if (mode == 1073741824) {
                if (wx1Var.o() != iMin) {
                    wx1Var.K(iMin);
                    z15 = true;
                    ey2Var.b = true;
                } else {
                    z15 = true;
                }
                i27 = 1073741824;
            } else {
                z15 = true;
            }
            if (mode2 == i27) {
                if (wx1Var.i() != iMin2) {
                    wx1Var.H(iMin2);
                    ey2Var.b = z15;
                }
                i27 = 1073741824;
            }
            if (mode == i27) {
                z3 = z3;
                wx1Var3 = wx1Var2;
                arrayList2 = arrayList;
                bVar = bVar;
                aVar3 = aVar10;
                aVar4 = aVar9;
                wx1Var4 = ey2Var.a;
                if (ey2Var.b) {
                    arrayList5 = wx1Var4.r0;
                    i30 = 0;
                    while (i30 < size5) {
                        vx1 vx1Var1115 = arrayList5.get(i30);
                        i30++;
                        vx1 vx1Var1116 = vx1Var1115;
                        vx1Var1116.f();
                        vx1Var1116.a = false;
                        ArrayList<vx1> arrayList118 = arrayList5;
                        o15 o15Var118 = vx1Var1116.d;
                        o15Var118.e.j = false;
                        o15Var118.g = false;
                        o15Var118.n();
                        meb mebVar118 = vx1Var1116.e;
                        mebVar118.e.j = false;
                        mebVar118.g = false;
                        mebVar118.m();
                        arrayList5 = arrayList118;
                    }
                    i28 = 0;
                    wx1Var4.f();
                    wx1Var4.a = false;
                    o15 o15Var119 = wx1Var4.d;
                    o15Var119.e.j = false;
                    o15Var119.g = false;
                    o15Var119.n();
                    meb mebVar119 = wx1Var4.e;
                    mebVar119.e.j = false;
                    mebVar119.g = false;
                    mebVar119.m();
                    ey2Var.c();
                } else {
                    i28 = 0;
                }
                ey2Var.b(ey2Var.d);
                wx1Var4.a0 = i28;
                wx1Var4.b0 = i28;
                wx1Var4.d.h.d(i28);
                wx1Var4.e.h.d(i28);
                i29 = 1073741824;
                if (mode == 1073741824) {
                    zQ = wx1Var.Q(i28, zB);
                    i9 = 1;
                } else {
                    i9 = 0;
                    zQ = true;
                }
                if (mode2 == 1073741824) {
                    zQ &= wx1Var.Q(1, zB);
                    i9++;
                }
            } else {
                z3 = z3;
                wx1Var3 = wx1Var2;
                arrayList2 = arrayList;
                bVar = bVar;
                aVar3 = aVar10;
                aVar4 = aVar9;
                wx1Var4 = ey2Var.a;
                if (ey2Var.b) {
                    arrayList5 = wx1Var4.r0;
                    i30 = 0;
                    while (i30 < size5) {
                        vx1 vx1Var1117 = arrayList5.get(i30);
                        i30++;
                        vx1 vx1Var1118 = vx1Var1117;
                        vx1Var1118.f();
                        vx1Var1118.a = false;
                        ArrayList<vx1> arrayList119 = arrayList5;
                        o15 o15Var1110 = vx1Var1118.d;
                        o15Var1110.e.j = false;
                        o15Var1110.g = false;
                        o15Var1110.n();
                        meb mebVar1110 = vx1Var1118.e;
                        mebVar1110.e.j = false;
                        mebVar1110.g = false;
                        mebVar1110.m();
                        arrayList5 = arrayList119;
                    }
                    i28 = 0;
                    wx1Var4.f();
                    wx1Var4.a = false;
                    o15 o15Var1111 = wx1Var4.d;
                    o15Var1111.e.j = false;
                    o15Var1111.g = false;
                    o15Var1111.n();
                    meb mebVar1111 = wx1Var4.e;
                    mebVar1111.e.j = false;
                    mebVar1111.g = false;
                    mebVar1111.m();
                    ey2Var.c();
                } else {
                    i28 = 0;
                }
                ey2Var.b(ey2Var.d);
                wx1Var4.a0 = i28;
                wx1Var4.b0 = i28;
                wx1Var4.d.h.d(i28);
                wx1Var4.e.h.d(i28);
                i29 = 1073741824;
                if (mode == 1073741824) {
                    zQ = wx1Var.Q(i28, zB);
                    i9 = 1;
                } else {
                    i9 = 0;
                    zQ = true;
                }
                if (mode2 == 1073741824) {
                    zQ &= wx1Var.Q(1, zB);
                    i9++;
                }
            }
            if (zQ) {
                if (mode == i29) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (mode2 == i29) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                wx1Var.L(z16, z17);
            }
        } else {
            z3 = z3;
            wx1Var3 = wx1Var2;
            arrayList2 = arrayList;
            bVar = bVar;
            aVar3 = aVar10;
            aVar4 = aVar9;
            i9 = 0;
            zQ = false;
        }
        if (zQ) {
        }
        i10 = wx1Var.E0;
        if (i8 > 0) {
            size3 = wx1Var.r0.size();
            boolean zS8 = wx1Var.S(64);
            bVar4 = wx1Var.v0;
            while (i24 < size3) {
                vx1Var6 = wx1Var.r0.get(i24);
                if (!(vx1Var6 instanceof vp4)) {
                    aVarH = vx1Var6.h(0);
                    aVarH2 = vx1Var6.h(1);
                    if (aVarH == aVar2) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        if (aVarH == aVar2) {
                            z14 = true;
                        }
                        if (aVarH2 == aVar2) {
                            z14 = true;
                        }
                        if (aVarH != aVar2) {
                        }
                    }
                    if (z14) {
                        ll0Var.a(0, bVar4, vx1Var6);
                    }
                }
            }
            constraintLayout = ((b) bVar4).a;
            childCount = constraintLayout.getChildCount();
            arrayList4 = constraintLayout.u;
            while (i25 < childCount) {
                childAt = constraintLayout.getChildAt(i25);
                if (childAt instanceof Placeholder) {
                    placeholder = (Placeholder) childAt;
                    if (placeholder.u == null) {
                        a aVar111 = (a) placeholder.getLayoutParams();
                        aVar8 = (a) placeholder.u.getLayoutParams();
                        vx1Var3 = aVar8.q0;
                        vx1Var3.i0 = 0;
                        vx1Var4 = aVar111.q0;
                        if (vx1Var4.U[0] != aVar3) {
                            vx1Var4.K(vx1Var3.o());
                        }
                        vx1Var5 = aVar111.q0;
                        if (vx1Var5.U[1] != aVar3) {
                            vx1Var5.H(aVar8.q0.i());
                        }
                        aVar8.q0.i0 = 8;
                    }
                }
            }
            size4 = arrayList4.size();
            if (size4 > 0) {
                while (i26 < size4) {
                    arrayList4.get(i26).getClass();
                }
            }
        }
        ll0Var.c(wx1Var);
        size2 = arrayList2.size();
        if (i8 > 0) {
            ll0Var.b(wx1Var, 0, iO2, i7);
        }
        if (size2 > 0) {
            aVarArr = wx1Var.U;
            aVar5 = aVar4;
            if (aVarArr[0] == aVar5) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (aVarArr[1] == aVar5) {
                z5 = true;
            } else {
                z5 = false;
            }
            wx1 wx1Var13 = wx1Var3;
            iMax3 = Math.max(wx1Var.o(), wx1Var13.d0);
            iMax4 = Math.max(wx1Var.i(), wx1Var13.e0);
            i12 = 0;
            z6 = false;
            while (true) {
                aVar6 = sx1.a.w;
                aVar7 = sx1.a.v;
                if (i12 < size2) {
                    break;
                    break;
                }
                ArrayList<vx1> arrayList1110 = arrayList2;
                vx1Var2 = arrayList1110.get(i12);
                z11 = z5;
                if (vx1Var2 instanceof kjb) {
                    z12 = z4;
                    bVar3 = bVar;
                } else {
                    iO5 = vx1Var2.o();
                    i22 = vx1Var2.i();
                    z12 = z4;
                    bVar3 = bVar;
                    zA2 = z6 | ll0Var.a(1, bVar3, vx1Var2);
                    iO6 = vx1Var2.o();
                    i23 = vx1Var2.i();
                    if (iO6 != iO5) {
                        vx1Var2.K(iO6);
                        if (z12) {
                            iMax3 = Math.max(iMax3, vx1Var2.g(aVar7).d() + vx1Var2.p() + vx1Var2.W);
                        }
                        z13 = true;
                    } else {
                        z13 = zA2;
                    }
                    if (i23 != i22) {
                        vx1Var2.H(i23);
                        if (z11) {
                            iMax4 = Math.max(iMax4, vx1Var2.g(aVar6).d() + vx1Var2.q() + vx1Var2.X);
                        }
                        z13 = true;
                    }
                    z6 = z13;
                }
                i12++;
                z5 = z11;
                bVar = bVar3;
                arrayList2 = arrayList1110;
                i10 = i10;
                z4 = z12;
            }
            int i4117 = i10;
            z7 = z5;
            z8 = z4;
            z9 = z6;
            bVar2 = bVar;
            arrayList3 = arrayList2;
            i13 = 0;
            while (i13 < 2) {
                i14 = 0;
                while (i14 < size2) {
                    vx1Var = arrayList3.get(i14);
                    if (vx1Var instanceof dw4) {
                        if (vx1Var.i0 == 8) {
                            i18 = size2;
                            i20 = i13;
                            i19 = i14;
                        } else {
                            iO3 = vx1Var.o();
                            i17 = vx1Var.i();
                            i18 = size2;
                            int i4118 = vx1Var.c0;
                            i19 = i14;
                            zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                            i20 = i13;
                            iO4 = vx1Var.o();
                            i21 = vx1Var.i();
                            if (iO4 != iO3) {
                                vx1Var.K(iO4);
                                if (z8) {
                                    iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                                }
                                z10 = true;
                            } else {
                                z10 = zA;
                            }
                            if (i21 != i17) {
                                vx1Var.H(i21);
                                if (z7) {
                                    iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                                }
                                z10 = true;
                            }
                            if (vx1Var.E) {
                                z9 = z10;
                            } else {
                                z9 = z10;
                            }
                        }
                    } else if (vx1Var.i0 == 8) {
                        i18 = size2;
                        i20 = i13;
                        i19 = i14;
                    } else {
                        iO3 = vx1Var.o();
                        i17 = vx1Var.i();
                        i18 = size2;
                        int i4119 = vx1Var.c0;
                        i19 = i14;
                        zA = z9 | ll0Var.a(i13 == 1 ? 2 : 1, bVar2, vx1Var);
                        i20 = i13;
                        iO4 = vx1Var.o();
                        i21 = vx1Var.i();
                        if (iO4 != iO3) {
                            vx1Var.K(iO4);
                            if (z8) {
                                iMax3 = Math.max(iMax3, vx1Var.g(aVar7).d() + vx1Var.p() + vx1Var.W);
                            }
                            z10 = true;
                        } else {
                            z10 = zA;
                        }
                        if (i21 != i17) {
                            vx1Var.H(i21);
                            if (z7) {
                                iMax4 = Math.max(iMax4, vx1Var.g(aVar6).d() + vx1Var.q() + vx1Var.X);
                            }
                            z10 = true;
                        }
                        if (vx1Var.E) {
                            z9 = z10;
                        } else {
                            z9 = z10;
                        }
                    }
                    i14 = i19 + 1;
                    size2 = i18;
                    i13 = i20;
                }
                i15 = size2;
                i16 = i13;
                if (z9) {
                    break;
                    break;
                }
                i13 = i16 + 1;
                ll0Var.b(wx1Var, i13, iO2, i7);
                size2 = i15;
                z9 = false;
            }
            i11 = i4117;
        } else {
            i11 = i10;
        }
        wx1Var.E0 = i11;
        j86.q = wx1Var.S(512);
    }

    public final void f(vx1 vx1Var, a aVar, SparseArray<vx1> sparseArray, int i, sx1.a aVar2) {
        View view = this.t.get(i);
        vx1 vx1Var2 = sparseArray.get(i);
        if (vx1Var2 == null || view == null || !(view.getLayoutParams() instanceof a)) {
            return;
        }
        aVar.c0 = true;
        sx1.a aVar3 = sx1.a.x;
        if (aVar2 == aVar3) {
            a aVar4 = (a) view.getLayoutParams();
            aVar4.c0 = true;
            aVar4.q0.E = true;
        }
        vx1Var.g(aVar3).a(vx1Var2.g(aVar2), aVar.D, aVar.C);
        vx1Var.E = true;
        vx1Var.g(sx1.a.u).g();
        vx1Var.g(sx1.a.w).g();
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.A = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.z;
    }

    public int getMaxWidth() {
        return this.y;
    }

    public int getMinHeight() {
        return this.x;
    }

    public int getMinWidth() {
        return this.w;
    }

    public int getOptimizationLevel() {
        return this.v.E0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        wx1 wx1Var = this.v;
        if (wx1Var.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                wx1Var.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                wx1Var.j = "parent";
            }
        }
        if (wx1Var.j0 == null) {
            wx1Var.j0 = wx1Var.j;
            Log.v("ConstraintLayout", " setDebugName " + wx1Var.j0);
        }
        ArrayList<vx1> arrayList = wx1Var.r0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            vx1 vx1Var = arrayList.get(i);
            i++;
            vx1 vx1Var2 = vx1Var;
            View view = vx1Var2.h0;
            if (view != null) {
                if (vx1Var2.j == null && (id = view.getId()) != -1) {
                    vx1Var2.j = getContext().getResources().getResourceEntryName(id);
                }
                if (vx1Var2.j0 == null) {
                    vx1Var2.j0 = vx1Var2.j;
                    Log.v("ConstraintLayout", " setDebugName " + vx1Var2.j0);
                }
            }
        }
        wx1Var.l(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            a aVar = (a) childAt.getLayoutParams();
            vx1 vx1Var = aVar.q0;
            if ((childAt.getVisibility() != 8 || aVar.d0 || aVar.e0 || zIsInEditMode) && !aVar.f0) {
                int iP = vx1Var.p();
                int iQ = vx1Var.q();
                int iO = vx1Var.o() + iP;
                int i6 = vx1Var.i() + iQ;
                childAt.layout(iP, iQ, iO, i6);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iP, iQ, iO, i6);
                }
            }
        }
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.u;
        int size = arrayList.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                arrayList.get(i7).j();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:126:0x0226  */
    /* JADX WARN: Code duplicated, block: B:135:0x025e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0385  */
    /* JADX WARN: Code duplicated, block: B:179:0x038f  */
    /* JADX WARN: Code duplicated, block: B:182:0x039d  */
    /* JADX WARN: Code duplicated, block: B:189:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:191:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:194:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:199:0x0400  */
    /* JADX WARN: Code duplicated, block: B:202:0x0408  */
    /* JADX WARN: Code duplicated, block: B:204:0x0412  */
    /* JADX WARN: Code duplicated, block: B:205:0x0422  */
    /* JADX WARN: Code duplicated, block: B:207:0x0425  */
    /* JADX WARN: Code duplicated, block: B:214:0x0447  */
    /* JADX WARN: Code duplicated, block: B:216:0x0453  */
    /* JADX WARN: Code duplicated, block: B:218:0x0457  */
    /* JADX WARN: Code duplicated, block: B:219:0x0460  */
    /* JADX WARN: Code duplicated, block: B:221:0x046a  */
    /* JADX WARN: Code duplicated, block: B:224:0x0471  */
    /* JADX WARN: Code duplicated, block: B:227:0x0479  */
    /* JADX WARN: Code duplicated, block: B:299:0x05a8  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        vx1 vx1Var;
        sx1.a aVar;
        vx1 vx1Var2;
        sx1.a aVar2;
        sx1.a aVar3;
        sx1.a aVar4;
        vx1 vx1Var3;
        sx1.a aVar5;
        int i4;
        int i5;
        int i6;
        sx1.a aVar6;
        sx1.a aVar7;
        vx1 vx1Var4;
        int i7;
        sx1.a aVar8;
        int i8;
        vx1 vx1Var5;
        a aVar9;
        int i9;
        int i10;
        int i11;
        vx1 vx1Var6;
        sx1.a aVar10;
        float f;
        vx1 vx1Var7;
        vx1 vx1Var8;
        sx1.a aVar11;
        vx1 vx1Var9;
        SparseArray<vx1> sparseArray;
        boolean z3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float fAbs;
        int i17;
        byte b2;
        SparseArray<View> sparseArray2;
        ArrayList<androidx.constraintlayout.widget.b> arrayList;
        String str;
        int iG;
        boolean z4;
        vx1 vx1Var10;
        ConstraintLayout constraintLayout = this;
        boolean z5 = constraintLayout.A;
        constraintLayout.A = z5;
        boolean z6 = true;
        int i18 = 0;
        if (!z5) {
            int childCount = constraintLayout.getChildCount();
            for (int i19 = 0; i19 < childCount; i19++) {
                if (constraintLayout.getChildAt(i19).isLayoutRequested()) {
                    constraintLayout.A = true;
                    break;
                }
            }
        }
        boolean zC = constraintLayout.c();
        wx1 wx1Var = constraintLayout.v;
        wx1Var.w0 = zC;
        if (constraintLayout.A) {
            constraintLayout.A = false;
            int childCount2 = constraintLayout.getChildCount();
            int i20 = 0;
            while (true) {
                if (i20 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i20).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i20++;
                }
            }
            if (z) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i21 = 0; i21 < childCount3; i21++) {
                    vx1 vx1VarA = constraintLayout.a(constraintLayout.getChildAt(i21));
                    if (vx1VarA != null) {
                        vx1VarA.A();
                    }
                }
                SparseArray<View> sparseArray3 = constraintLayout.t;
                if (zIsInEditMode) {
                    int i22 = 0;
                    while (i22 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i22);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                z4 = z6;
                                try {
                                    if (constraintLayout.F == null) {
                                        constraintLayout.F = new HashMap<>();
                                    }
                                    int iIndexOf = resourceName.indexOf(AgentHeaderCreator.AGENT_DIVIDER);
                                    constraintLayout.F.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                z4 = z6;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = sparseArray3.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                vx1Var10 = viewFindViewById == constraintLayout ? wx1Var : viewFindViewById == null ? null : ((a) viewFindViewById.getLayoutParams()).q0;
                            }
                            vx1Var10.j0 = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                            z4 = z6;
                        }
                        i22++;
                        z6 = z4;
                    }
                }
                boolean z7 = z6;
                if (constraintLayout.E != -1) {
                    for (int i23 = 0; i23 < childCount3; i23++) {
                        View childAt2 = constraintLayout.getChildAt(i23);
                        if (childAt2.getId() == constraintLayout.E && (childAt2 instanceof d)) {
                            constraintLayout.C = ((d) childAt2).getConstraintSet();
                        }
                    }
                }
                c cVar = constraintLayout.C;
                if (cVar != null) {
                    cVar.b(constraintLayout);
                }
                wx1Var.r0.clear();
                ArrayList<androidx.constraintlayout.widget.b> arrayList2 = constraintLayout.u;
                int size = arrayList2.size();
                if (size > 0) {
                    int i24 = 0;
                    while (i24 < size) {
                        androidx.constraintlayout.widget.b bVar = arrayList2.get(i24);
                        HashMap<Integer, String> map = bVar.A;
                        if (bVar.isInEditMode()) {
                            bVar.setIds(bVar.x);
                        }
                        rj0 rj0Var = bVar.w;
                        if (rj0Var == null) {
                            sparseArray2 = sparseArray3;
                            arrayList = arrayList2;
                        } else {
                            rj0Var.s0 = i18;
                            Arrays.fill(rj0Var.r0, (Object) null);
                            int i25 = 0;
                            while (i25 < bVar.u) {
                                int i26 = bVar.t[i25];
                                View view = sparseArray3.get(i26);
                                if (view == null && (iG = bVar.g(constraintLayout, (str = map.get(Integer.valueOf(i26))))) != 0) {
                                    bVar.t[i25] = iG;
                                    map.put(Integer.valueOf(iG), str);
                                    view = sparseArray3.get(iG);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    rj0 rj0Var2 = bVar.w;
                                    vx1 vx1VarA2 = constraintLayout.a(view2);
                                    rj0Var2.getClass();
                                    if (vx1VarA2 != rj0Var2 && vx1VarA2 != null) {
                                        int i27 = rj0Var2.s0 + 1;
                                        vx1[] vx1VarArr = rj0Var2.r0;
                                        if (i27 > vx1VarArr.length) {
                                            rj0Var2.r0 = (vx1[]) Arrays.copyOf(vx1VarArr, vx1VarArr.length * 2);
                                        }
                                        vx1[] vx1VarArr2 = rj0Var2.r0;
                                        int i28 = rj0Var2.s0;
                                        vx1VarArr2[i28] = vx1VarA2;
                                        rj0Var2.s0 = i28 + 1;
                                    }
                                }
                                i25++;
                                sparseArray3 = sparseArray3;
                                arrayList2 = arrayList2;
                            }
                            sparseArray2 = sparseArray3;
                            arrayList = arrayList2;
                            bVar.w.getClass();
                        }
                        i24++;
                        sparseArray3 = sparseArray2;
                        arrayList2 = arrayList;
                        i18 = 0;
                    }
                }
                int i29 = 2;
                int i30 = 0;
                while (i30 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i30);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.t == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.v);
                        }
                        View viewFindViewById2 = constraintLayout.findViewById(placeholder.t);
                        placeholder.u = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((a) viewFindViewById2.getLayoutParams()).f0 = z7;
                            placeholder.u.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                    i30++;
                    z7 = true;
                }
                SparseArray<vx1> sparseArray4 = constraintLayout.G;
                sparseArray4.clear();
                sparseArray4.put(0, wx1Var);
                sparseArray4.put(constraintLayout.getId(), wx1Var);
                for (int i31 = 0; i31 < childCount3; i31++) {
                    View childAt4 = constraintLayout.getChildAt(i31);
                    sparseArray4.put(childAt4.getId(), constraintLayout.a(childAt4));
                }
                int i32 = 0;
                while (i32 < childCount3) {
                    View childAt5 = constraintLayout.getChildAt(i32);
                    vx1 vx1VarA3 = constraintLayout.a(childAt5);
                    if (vx1VarA3 == null) {
                        sparseArray = sparseArray4;
                        i3 = i32;
                        z2 = z;
                        z3 = zIsInEditMode;
                        i12 = childCount3;
                        i14 = i29;
                    } else {
                        a aVar12 = (a) childAt5.getLayoutParams();
                        wx1Var.r0.add(vx1VarA3);
                        vx1 vx1Var11 = vx1VarA3.V;
                        if (vx1Var11 != null) {
                            ((bmb) vx1Var11).r0.remove(vx1VarA3);
                            vx1VarA3.A();
                        }
                        vx1VarA3.V = wx1Var;
                        aVar12.a();
                        vx1VarA3.i0 = childAt5.getVisibility();
                        if (aVar12.f0) {
                            vx1VarA3.F = true;
                            vx1VarA3.i0 = 8;
                        }
                        vx1VarA3.h0 = childAt5;
                        if (childAt5 instanceof androidx.constraintlayout.widget.b) {
                            ((androidx.constraintlayout.widget.b) childAt5).i(vx1VarA3, wx1Var.w0);
                        }
                        if (aVar12.d0) {
                            vp4 vp4Var = (vp4) vx1VarA3;
                            int i33 = aVar12.n0;
                            int i34 = aVar12.o0;
                            float f2 = aVar12.p0;
                            if (f2 == -1.0f) {
                                b2 = -1;
                                if (i33 != -1) {
                                    if (i33 > -1) {
                                        vp4Var.r0 = -1.0f;
                                        vp4Var.s0 = i33;
                                        vp4Var.t0 = -1;
                                    }
                                } else if (i34 != -1 && i34 > -1) {
                                    vp4Var.r0 = -1.0f;
                                    vp4Var.s0 = -1;
                                    vp4Var.t0 = i34;
                                    sparseArray = sparseArray4;
                                    i3 = i32;
                                    z2 = z;
                                    z3 = zIsInEditMode;
                                    i12 = childCount3;
                                    i14 = i29;
                                }
                                sparseArray = sparseArray4;
                                i3 = i32;
                                z2 = z;
                                z3 = zIsInEditMode;
                                i12 = childCount3;
                                i14 = i29;
                            } else if (f2 > -1.0f) {
                                vp4Var.r0 = f2;
                                b2 = -1;
                                vp4Var.s0 = -1;
                                vp4Var.t0 = -1;
                                sparseArray = sparseArray4;
                                i3 = i32;
                                z2 = z;
                                z3 = zIsInEditMode;
                                i12 = childCount3;
                                i14 = i29;
                            } else {
                                sparseArray = sparseArray4;
                                i3 = i32;
                                z2 = z;
                                z3 = zIsInEditMode;
                                i12 = childCount3;
                                i14 = i29;
                            }
                        } else {
                            int i35 = aVar12.g0;
                            int i36 = aVar12.h0;
                            int i37 = aVar12.i0;
                            int i38 = aVar12.j0;
                            int i39 = aVar12.k0;
                            int i40 = aVar12.l0;
                            i3 = i32;
                            float f3 = aVar12.m0;
                            int i41 = aVar12.p;
                            sx1.a aVar13 = sx1.a.v;
                            sx1.a aVar14 = sx1.a.t;
                            z2 = z;
                            sx1.a aVar15 = sx1.a.w;
                            sx1.a aVar16 = sx1.a.u;
                            if (i41 != -1) {
                                vx1 vx1Var12 = sparseArray4.get(i41);
                                if (vx1Var12 != null) {
                                    float f4 = aVar12.r;
                                    int i42 = aVar12.q;
                                    sx1.a aVar17 = sx1.a.y;
                                    vx1VarA3.t(aVar17, vx1Var12, aVar17, i42, 0);
                                    vx1VarA3.D = f4;
                                }
                                constraintLayout = this;
                                vx1Var6 = vx1VarA3;
                                aVar9 = aVar12;
                                aVar5 = aVar13;
                                aVar4 = aVar14;
                                aVar10 = aVar15;
                                aVar8 = aVar16;
                            } else {
                                if (i35 != -1) {
                                    vx1 vx1Var13 = sparseArray4.get(i35);
                                    if (vx1Var13 != null) {
                                        vx1Var = vx1VarA3;
                                        aVar = aVar14;
                                        vx1Var.t(aVar, vx1Var13, aVar14, ((ViewGroup.MarginLayoutParams) aVar12).leftMargin, i39);
                                    } else {
                                        vx1Var = vx1VarA3;
                                        aVar = aVar14;
                                    }
                                } else {
                                    vx1Var = vx1VarA3;
                                    aVar = aVar14;
                                    if (i36 != -1 && (vx1Var2 = sparseArray4.get(i36)) != null) {
                                        vx1Var.t(aVar, vx1Var2, aVar13, ((ViewGroup.MarginLayoutParams) aVar12).leftMargin, i39);
                                        aVar2 = aVar;
                                        aVar3 = aVar13;
                                    }
                                    if (i37 != -1) {
                                        vx1Var9 = sparseArray4.get(i37);
                                        if (vx1Var9 != null) {
                                            vx1Var.t(aVar3, vx1Var9, aVar2, ((ViewGroup.MarginLayoutParams) aVar12).rightMargin, i40);
                                        }
                                        aVar4 = aVar2;
                                    } else {
                                        aVar4 = aVar2;
                                        if (i38 != -1 && (vx1Var3 = sparseArray4.get(i38)) != null) {
                                            vx1Var.t(aVar3, vx1Var3, aVar3, ((ViewGroup.MarginLayoutParams) aVar12).rightMargin, i40);
                                        }
                                    }
                                    aVar5 = aVar3;
                                    i4 = aVar12.i;
                                    if (i4 != -1) {
                                        vx1Var8 = sparseArray4.get(i4);
                                        if (vx1Var8 != null) {
                                            aVar11 = aVar16;
                                            vx1Var.t(aVar11, vx1Var8, aVar16, ((ViewGroup.MarginLayoutParams) aVar12).topMargin, aVar12.x);
                                        } else {
                                            aVar11 = aVar16;
                                        }
                                        aVar6 = aVar11;
                                        aVar7 = aVar15;
                                        i6 = -1;
                                    } else {
                                        i5 = aVar12.j;
                                        i6 = -1;
                                        if (i5 != -1 || (vx1Var4 = sparseArray4.get(i5)) == null) {
                                            aVar6 = aVar16;
                                            aVar7 = aVar15;
                                        } else {
                                            vx1Var.t(aVar16, vx1Var4, aVar15, ((ViewGroup.MarginLayoutParams) aVar12).topMargin, aVar12.x);
                                            aVar6 = aVar16;
                                            aVar7 = aVar15;
                                        }
                                    }
                                    i7 = aVar12.k;
                                    if (i7 != i6) {
                                        vx1Var7 = sparseArray4.get(i7);
                                        if (vx1Var7 != null) {
                                            sx1.a aVar18 = aVar6;
                                            vx1Var.t(aVar7, vx1Var7, aVar18, ((ViewGroup.MarginLayoutParams) aVar12).bottomMargin, aVar12.z);
                                            aVar8 = aVar18;
                                        } else {
                                            aVar8 = aVar6;
                                        }
                                    } else {
                                        aVar8 = aVar6;
                                        i8 = aVar12.l;
                                        if (i8 != i6 && (vx1Var5 = sparseArray4.get(i8)) != null) {
                                            vx1Var.t(aVar7, vx1Var5, aVar7, ((ViewGroup.MarginLayoutParams) aVar12).bottomMargin, aVar12.z);
                                        }
                                    }
                                    aVar9 = aVar12;
                                    i9 = aVar9.m;
                                    if (i9 != -1) {
                                        constraintLayout = this;
                                        vx1Var6 = vx1Var;
                                        constraintLayout.f(vx1Var6, aVar9, sparseArray4, i9, sx1.a.x);
                                    } else {
                                        i10 = aVar9.n;
                                        if (i10 != -1) {
                                            constraintLayout = this;
                                            vx1Var6 = vx1Var;
                                            constraintLayout.f(vx1Var6, aVar9, sparseArray4, i10, aVar8);
                                        } else {
                                            i11 = aVar9.o;
                                            constraintLayout = this;
                                            vx1Var6 = vx1Var;
                                            aVar10 = aVar7;
                                            if (i11 != -1) {
                                                constraintLayout.f(vx1Var6, aVar9, sparseArray4, i11, aVar10);
                                            }
                                        }
                                        if (f3 >= 0.0f) {
                                            vx1Var6.f0 = f3;
                                        }
                                        f = aVar9.F;
                                        if (f >= 0.0f) {
                                            vx1Var6.g0 = f;
                                        }
                                    }
                                    aVar10 = aVar7;
                                    if (f3 >= 0.0f) {
                                        vx1Var6.f0 = f3;
                                    }
                                    f = aVar9.F;
                                    if (f >= 0.0f) {
                                        vx1Var6.g0 = f;
                                    }
                                }
                                aVar2 = aVar;
                                aVar3 = aVar13;
                                if (i37 != -1) {
                                    vx1Var9 = sparseArray4.get(i37);
                                    if (vx1Var9 != null) {
                                        vx1Var.t(aVar3, vx1Var9, aVar2, ((ViewGroup.MarginLayoutParams) aVar12).rightMargin, i40);
                                    }
                                    aVar4 = aVar2;
                                } else {
                                    aVar4 = aVar2;
                                    if (i38 != -1) {
                                        vx1Var.t(aVar3, vx1Var3, aVar3, ((ViewGroup.MarginLayoutParams) aVar12).rightMargin, i40);
                                    }
                                }
                                aVar5 = aVar3;
                                i4 = aVar12.i;
                                if (i4 != -1) {
                                    vx1Var8 = sparseArray4.get(i4);
                                    if (vx1Var8 != null) {
                                        aVar11 = aVar16;
                                        vx1Var.t(aVar11, vx1Var8, aVar16, ((ViewGroup.MarginLayoutParams) aVar12).topMargin, aVar12.x);
                                    } else {
                                        aVar11 = aVar16;
                                    }
                                    aVar6 = aVar11;
                                    aVar7 = aVar15;
                                    i6 = -1;
                                } else {
                                    i5 = aVar12.j;
                                    i6 = -1;
                                    if (i5 != -1) {
                                        aVar6 = aVar16;
                                        aVar7 = aVar15;
                                    } else {
                                        aVar6 = aVar16;
                                        aVar7 = aVar15;
                                    }
                                }
                                i7 = aVar12.k;
                                if (i7 != i6) {
                                    vx1Var7 = sparseArray4.get(i7);
                                    if (vx1Var7 != null) {
                                        sx1.a aVar19 = aVar6;
                                        vx1Var.t(aVar7, vx1Var7, aVar19, ((ViewGroup.MarginLayoutParams) aVar12).bottomMargin, aVar12.z);
                                        aVar8 = aVar19;
                                    } else {
                                        aVar8 = aVar6;
                                    }
                                } else {
                                    aVar8 = aVar6;
                                    i8 = aVar12.l;
                                    if (i8 != i6) {
                                        vx1Var.t(aVar7, vx1Var5, aVar7, ((ViewGroup.MarginLayoutParams) aVar12).bottomMargin, aVar12.z);
                                    }
                                }
                                aVar9 = aVar12;
                                i9 = aVar9.m;
                                if (i9 != -1) {
                                    constraintLayout = this;
                                    vx1Var6 = vx1Var;
                                    constraintLayout.f(vx1Var6, aVar9, sparseArray4, i9, sx1.a.x);
                                } else {
                                    i10 = aVar9.n;
                                    if (i10 != -1) {
                                        constraintLayout = this;
                                        vx1Var6 = vx1Var;
                                        constraintLayout.f(vx1Var6, aVar9, sparseArray4, i10, aVar8);
                                    } else {
                                        i11 = aVar9.o;
                                        constraintLayout = this;
                                        vx1Var6 = vx1Var;
                                        aVar10 = aVar7;
                                        if (i11 != -1) {
                                            constraintLayout.f(vx1Var6, aVar9, sparseArray4, i11, aVar10);
                                        }
                                    }
                                    if (f3 >= 0.0f) {
                                        vx1Var6.f0 = f3;
                                    }
                                    f = aVar9.F;
                                    if (f >= 0.0f) {
                                        vx1Var6.g0 = f;
                                    }
                                }
                                aVar10 = aVar7;
                                if (f3 >= 0.0f) {
                                    vx1Var6.f0 = f3;
                                }
                                f = aVar9.F;
                                if (f >= 0.0f) {
                                    vx1Var6.g0 = f;
                                }
                            }
                            if (zIsInEditMode && ((i17 = aVar9.T) != -1 || aVar9.U != -1)) {
                                int i43 = aVar9.U;
                                vx1Var6.a0 = i17;
                                vx1Var6.b0 = i43;
                            }
                            boolean z8 = aVar9.a0;
                            vx1.a aVar20 = vx1.a.u;
                            vx1.a aVar21 = vx1.a.t;
                            sparseArray = sparseArray4;
                            vx1.a aVar22 = vx1.a.w;
                            vx1.a aVar23 = vx1.a.v;
                            if (z8) {
                                z3 = zIsInEditMode;
                                i12 = childCount3;
                                vx1Var6.I(aVar21);
                                vx1Var6.K(((ViewGroup.MarginLayoutParams) aVar9).width);
                                if (((ViewGroup.MarginLayoutParams) aVar9).width == -2) {
                                    vx1Var6.I(aVar20);
                                }
                            } else {
                                z3 = zIsInEditMode;
                                i12 = childCount3;
                                if (((ViewGroup.MarginLayoutParams) aVar9).width == -1) {
                                    if (aVar9.W) {
                                        vx1Var6.I(aVar23);
                                    } else {
                                        vx1Var6.I(aVar22);
                                    }
                                    vx1Var6.g(aVar4).g = ((ViewGroup.MarginLayoutParams) aVar9).leftMargin;
                                    vx1Var6.g(aVar5).g = ((ViewGroup.MarginLayoutParams) aVar9).rightMargin;
                                } else {
                                    vx1Var6.I(aVar23);
                                    vx1Var6.K(0);
                                }
                            }
                            if (aVar9.b0) {
                                i13 = -1;
                                vx1Var6.J(aVar21);
                                vx1Var6.H(((ViewGroup.MarginLayoutParams) aVar9).height);
                                if (((ViewGroup.MarginLayoutParams) aVar9).height == -2) {
                                    vx1Var6.J(aVar20);
                                }
                            } else {
                                i13 = -1;
                                if (((ViewGroup.MarginLayoutParams) aVar9).height == -1) {
                                    if (aVar9.X) {
                                        vx1Var6.J(aVar23);
                                    } else {
                                        vx1Var6.J(aVar22);
                                    }
                                    vx1Var6.g(aVar8).g = ((ViewGroup.MarginLayoutParams) aVar9).topMargin;
                                    vx1Var6.g(aVar10).g = ((ViewGroup.MarginLayoutParams) aVar9).bottomMargin;
                                } else {
                                    vx1Var6.J(aVar23);
                                    vx1Var6.H(0);
                                }
                            }
                            String str2 = aVar9.G;
                            if (str2 == null || str2.length() == 0) {
                                vx1Var6.Y = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i15 = i13;
                                    i16 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i15 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i13;
                                    i16 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i16);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i16, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f5 = Float.parseFloat(strSubstring3);
                                            float f6 = Float.parseFloat(strSubstring4);
                                            if (f5 <= 0.0f || f6 <= 0.0f) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i15 == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                }
                                if (fAbs > 0.0f) {
                                    vx1Var6.Y = fAbs;
                                    vx1Var6.Z = i15;
                                }
                            }
                            float f7 = aVar9.H;
                            float[] fArr = vx1Var6.m0;
                            fArr[0] = f7;
                            fArr[1] = aVar9.I;
                            vx1Var6.k0 = aVar9.J;
                            vx1Var6.l0 = aVar9.K;
                            int i44 = aVar9.Z;
                            if (i44 >= 0 && i44 <= 3) {
                                vx1Var6.q = i44;
                            }
                            int i45 = aVar9.L;
                            int i46 = aVar9.N;
                            int i47 = aVar9.P;
                            float f8 = aVar9.R;
                            vx1Var6.r = i45;
                            vx1Var6.u = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            vx1Var6.v = i47;
                            vx1Var6.w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i45 == 0) {
                                vx1Var6.r = i29;
                            }
                            int i48 = aVar9.M;
                            int i49 = aVar9.O;
                            int i50 = aVar9.Q;
                            float f9 = aVar9.S;
                            vx1Var6.s = i48;
                            vx1Var6.x = i49;
                            vx1Var6.y = i50 == Integer.MAX_VALUE ? 0 : i50;
                            vx1Var6.z = f9;
                            if (f9 <= 0.0f || f9 >= 1.0f || i48 != 0) {
                                i14 = 2;
                            } else {
                                i14 = 2;
                                vx1Var6.s = 2;
                            }
                        }
                    }
                    i32 = i3 + 1;
                    i29 = i14;
                    sparseArray4 = sparseArray;
                    zIsInEditMode = z3;
                    childCount3 = i12;
                    z = z2;
                }
            }
            if (z) {
                wx1Var.s0.c(wx1Var);
            }
        }
        wx1Var.x0.getClass();
        constraintLayout.e(wx1Var, constraintLayout.B, i, i2);
        int iO = wx1Var.o();
        int i51 = wx1Var.i();
        boolean z9 = wx1Var.F0;
        boolean z10 = wx1Var.G0;
        b bVar2 = constraintLayout.H;
        int i52 = bVar2.e;
        int iResolveSizeAndState = View.resolveSizeAndState(iO + bVar2.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i51 + i52, i2, 0) & 16777215;
        int iMin = Math.min(constraintLayout.y, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.z, iResolveSizeAndState2);
        if (z9) {
            iMin |= 16777216;
        }
        if (z10) {
            iMin2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        vx1 vx1VarA = a(view);
        if ((view instanceof Guideline) && !(vx1VarA instanceof vp4)) {
            a aVar = (a) view.getLayoutParams();
            vp4 vp4Var = new vp4();
            aVar.q0 = vp4Var;
            aVar.d0 = true;
            vp4Var.O(aVar.V);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) view;
            bVar.k();
            ((a) view.getLayoutParams()).e0 = true;
            ArrayList<androidx.constraintlayout.widget.b> arrayList = this.u;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.t.put(view.getId(), view);
        this.A = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.t.remove(view.getId());
        vx1 vx1VarA = a(view);
        this.v.r0.remove(vx1VarA);
        vx1VarA.A();
        this.u.remove(view);
        this.A = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.A = true;
        super.requestLayout();
    }

    public void setConstraintSet(c cVar) {
        this.C = cVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray<View> sparseArray = this.t;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.z) {
            return;
        }
        this.z = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.y) {
            return;
        }
        this.y = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.x) {
            return;
        }
        this.x = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.w) {
            return;
        }
        this.w = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(yx1 yx1Var) {
        tx1 tx1Var = this.D;
        if (tx1Var != null) {
            tx1Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.B = i;
        wx1 wx1Var = this.v;
        wx1Var.E0 = i;
        j86.q = wx1Var.S(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = new SparseArray<>();
        this.u = new ArrayList<>(4);
        this.v = new wx1();
        this.w = 0;
        this.x = 0;
        this.y = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.A = true;
        this.B = 257;
        this.C = null;
        this.D = null;
        this.E = -1;
        this.F = new HashMap<>();
        this.G = new SparseArray<>();
        this.H = new b(this);
        b(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = new SparseArray<>();
        this.u = new ArrayList<>(4);
        this.v = new wx1();
        this.w = 0;
        this.x = 0;
        this.y = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.A = true;
        this.B = 257;
        this.C = null;
        this.D = null;
        this.E = -1;
        this.F = new HashMap<>();
        this.G = new SparseArray<>();
        this.H = new b(this);
        b(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.t = new SparseArray<>();
        this.u = new ArrayList<>(4);
        this.v = new wx1();
        this.w = 0;
        this.x = 0;
        this.y = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.A = true;
        this.B = 257;
        this.C = null;
        this.D = null;
        this.E = -1;
        this.F = new HashMap<>();
        this.G = new SparseArray<>();
        this.H = new b(this);
        b(attributeSet, i, i2);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public boolean c0;
        public final boolean d;
        public boolean d0;
        public int e;
        public boolean e0;
        public int f;
        public boolean f0;
        public int g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public float m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public vx1 q0;
        public float r;
        public int s;
        public int t;
        public int u;
        public int v;
        public final int w;
        public int x;
        public final int y;
        public int z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class C0008a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new vx1();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hh8.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = C0008a.a.get(index);
                switch (i2) {
                    case 1:
                        this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f;
                        if (f < 0.0f) {
                            this.r = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case h4c.e /* 15 */:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case InboxPagingSource.PAGE_SIZE /* 20 */:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 23:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = typedArrayObtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = typedArrayObtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.L = i3;
                        if (i3 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.M = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                            }
                        }
                        break;
                    case 35:
                        this.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                        break;
                    case 38:
                        this.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i2) {
                            case Carousel.ENTITY_TYPE /* 44 */:
                                c.j(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = typedArrayObtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                                        c.i(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        c.i(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.d0 = false;
            this.a0 = true;
            this.b0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.W) {
                this.a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.X) {
                this.b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.a0 = false;
                if (i == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.b0 = false;
                if (i2 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.d0 = true;
            this.a0 = true;
            this.b0 = true;
            if (!(this.q0 instanceof vp4)) {
                this.q0 = new vp4();
            }
            ((vp4) this.q0).O(this.V);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004a  */
        /* JADX WARN: Code duplicated, block: B:19:0x0051  */
        /* JADX WARN: Code duplicated, block: B:22:0x0058  */
        /* JADX WARN: Code duplicated, block: B:25:0x005e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0064  */
        /* JADX WARN: Code duplicated, block: B:37:0x007a  */
        /* JADX WARN: Code duplicated, block: B:38:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x0084  */
        /* JADX WARN: Code duplicated, block: B:40:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public final void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.i0 = -1;
            this.j0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.k0 = this.w;
            this.l0 = this.y;
            float f = this.E;
            this.m0 = f;
            int i8 = this.a;
            this.n0 = i8;
            int i9 = this.b;
            this.o0 = i9;
            float f2 = this.c;
            this.p0 = f2;
            int i10 = this.s;
            if (z2) {
                if (i10 != -1) {
                    this.i0 = i10;
                } else {
                    int i11 = this.t;
                    if (i11 != -1) {
                        this.j0 = i11;
                    } else {
                        i2 = this.u;
                        if (i2 != -1) {
                            this.h0 = i2;
                            z = true;
                        }
                        i3 = this.v;
                        if (i3 != -1) {
                            this.g0 = i3;
                            z = true;
                        }
                        i4 = this.A;
                        if (i4 != Integer.MIN_VALUE) {
                            this.l0 = i4;
                        }
                        i5 = this.B;
                        if (i5 != Integer.MIN_VALUE) {
                            this.k0 = i5;
                        }
                        if (z) {
                            this.m0 = 1.0f - f;
                        }
                        if (this.d0 && this.V == 1 && this.d) {
                            if (f2 != -1.0f) {
                                this.p0 = 1.0f - f2;
                                this.n0 = -1;
                                this.o0 = -1;
                            } else if (i8 != -1) {
                                this.o0 = i8;
                                this.n0 = -1;
                                this.p0 = -1.0f;
                            } else if (i9 != -1) {
                                this.n0 = i9;
                                this.o0 = -1;
                                this.p0 = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i2 = this.u;
                if (i2 != -1) {
                    this.h0 = i2;
                    z = true;
                }
                i3 = this.v;
                if (i3 != -1) {
                    this.g0 = i3;
                    z = true;
                }
                i4 = this.A;
                if (i4 != Integer.MIN_VALUE) {
                    this.l0 = i4;
                }
                i5 = this.B;
                if (i5 != Integer.MIN_VALUE) {
                    this.k0 = i5;
                }
                if (z) {
                    this.m0 = 1.0f - f;
                }
                if (this.d0) {
                    if (f2 != -1.0f) {
                        this.p0 = 1.0f - f2;
                        this.n0 = -1;
                        this.o0 = -1;
                    } else if (i8 != -1) {
                        this.o0 = i8;
                        this.n0 = -1;
                        this.p0 = -1.0f;
                    } else if (i9 != -1) {
                        this.n0 = i9;
                        this.o0 = -1;
                        this.p0 = -1.0f;
                    }
                }
            } else {
                if (i10 != -1) {
                    this.h0 = i10;
                }
                int i12 = this.t;
                if (i12 != -1) {
                    this.g0 = i12;
                }
                int i13 = this.u;
                if (i13 != -1) {
                    this.i0 = i13;
                }
                int i14 = this.v;
                if (i14 != -1) {
                    this.j0 = i14;
                }
                int i15 = this.A;
                if (i15 != Integer.MIN_VALUE) {
                    this.k0 = i15;
                }
                int i16 = this.B;
                if (i16 != Integer.MIN_VALUE) {
                    this.l0 = i16;
                }
            }
            if (this.u == -1 && this.v == -1 && this.t == -1 && i10 == -1) {
                int i17 = this.g;
                if (i17 != -1) {
                    this.i0 = i17;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i18 = this.h;
                    if (i18 != -1) {
                        this.j0 = i18;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i19 = this.e;
                if (i19 != -1) {
                    this.g0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i20 = this.f;
                if (i20 != -1) {
                    this.h0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new vx1();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof a) {
                a aVar = (a) layoutParams;
                this.a = aVar.a;
                this.b = aVar.b;
                this.c = aVar.c;
                this.d = aVar.d;
                this.e = aVar.e;
                this.f = aVar.f;
                this.g = aVar.g;
                this.h = aVar.h;
                this.i = aVar.i;
                this.j = aVar.j;
                this.k = aVar.k;
                this.l = aVar.l;
                this.m = aVar.m;
                this.n = aVar.n;
                this.o = aVar.o;
                this.p = aVar.p;
                this.q = aVar.q;
                this.r = aVar.r;
                this.s = aVar.s;
                this.t = aVar.t;
                this.u = aVar.u;
                this.v = aVar.v;
                this.w = aVar.w;
                this.x = aVar.x;
                this.y = aVar.y;
                this.z = aVar.z;
                this.A = aVar.A;
                this.B = aVar.B;
                this.C = aVar.C;
                this.D = aVar.D;
                this.E = aVar.E;
                this.F = aVar.F;
                this.G = aVar.G;
                this.H = aVar.H;
                this.I = aVar.I;
                this.J = aVar.J;
                this.K = aVar.K;
                this.W = aVar.W;
                this.X = aVar.X;
                this.L = aVar.L;
                this.M = aVar.M;
                this.N = aVar.N;
                this.P = aVar.P;
                this.O = aVar.O;
                this.Q = aVar.Q;
                this.R = aVar.R;
                this.S = aVar.S;
                this.T = aVar.T;
                this.U = aVar.U;
                this.V = aVar.V;
                this.a0 = aVar.a0;
                this.b0 = aVar.b0;
                this.c0 = aVar.c0;
                this.d0 = aVar.d0;
                this.g0 = aVar.g0;
                this.h0 = aVar.h0;
                this.i0 = aVar.i0;
                this.j0 = aVar.j0;
                this.k0 = aVar.k0;
                this.l0 = aVar.l0;
                this.m0 = aVar.m0;
                this.Y = aVar.Y;
                this.Z = aVar.Z;
                this.q0 = aVar.q0;
            }
        }

        public a() {
            super(-2, -2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new vx1();
        }
    }
}
