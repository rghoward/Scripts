package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.hwpo_training_app.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i0a implements kl9 {
    public final int a;
    public final ll9 b;
    public final int[][] c;
    public final ll9[] d;
    public final g0a e;
    public final g0a f;
    public final g0a g;
    public final g0a h;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public int a;
        public ll9 b;
        public int[][] c;
        public ll9[] d;
        public g0a e;
        public g0a f;
        public g0a g;
        public g0a h;

        public final void a(int[] iArr, ll9 ll9Var) {
            int i = this.a;
            if (i == 0 || iArr.length == 0) {
                this.b = ll9Var;
            }
            int[][] iArr2 = this.c;
            if (i >= iArr2.length) {
                int i2 = i + 10;
                int[][] iArr3 = new int[i2][];
                System.arraycopy(iArr2, 0, iArr3, 0, i);
                this.c = iArr3;
                ll9[] ll9VarArr = new ll9[i2];
                System.arraycopy(this.d, 0, ll9VarArr, 0, i);
                this.d = ll9VarArr;
            }
            int[][] iArr4 = this.c;
            int i3 = this.a;
            iArr4[i3] = iArr;
            this.d[i3] = ll9Var;
            this.a = i3 + 1;
        }

        public final void b() {
            this.b = new ll9();
            this.c = new int[10][];
            this.d = new ll9[10];
        }
    }

    public i0a(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
    }

    public static void f(a aVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = bh8.t;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                ll9 ll9VarA = ll9.f(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                aVar.a(StateSet.trimStateSet(iArr2, i), ll9VarA);
            }
        }
    }

    public static i0a g(Context context, TypedArray typedArray, int i) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        a aVar = new a();
        aVar.b();
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    f(aVar, context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                if (aVar.a == 0) {
                    return null;
                }
                return new i0a(aVar);
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            aVar.b();
        }
    }

    @Override // defpackage.kl9
    public final ll9 a(float f) {
        return h().a(f);
    }

    @Override // defpackage.kl9
    public final ll9 b(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        while (true) {
            i = -1;
            i2 = this.a;
            iArr2 = this.c;
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            for (int i4 = 0; i4 < i2; i4++) {
                if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                    i = i4;
                    break;
                }
            }
            i3 = i;
        }
        ll9[] ll9VarArr = this.d;
        g0a g0aVar = this.h;
        g0a g0aVar2 = this.g;
        g0a g0aVar3 = this.f;
        g0a g0aVar4 = this.e;
        if (g0aVar4 == null && g0aVar3 == null && g0aVar2 == null && g0aVar == null) {
            return ll9VarArr[i3];
        }
        ll9.a aVarK = ll9VarArr[i3].k();
        if (g0aVar4 != null) {
            aVarK.e = g0aVar4.a(iArr);
        }
        if (g0aVar3 != null) {
            aVarK.f = g0aVar3.a(iArr);
        }
        if (g0aVar2 != null) {
            aVarK.h = g0aVar2.a(iArr);
        }
        if (g0aVar != null) {
            aVarK.g = g0aVar.a(iArr);
        }
        return aVarK.a();
    }

    @Override // defpackage.kl9
    public final ll9[] c() {
        return this.d;
    }

    @Override // defpackage.kl9
    public final ll9 d() {
        return h();
    }

    @Override // defpackage.kl9
    public final boolean e() {
        g0a g0aVar;
        g0a g0aVar2;
        g0a g0aVar3;
        g0a g0aVar4;
        return this.a > 1 || ((g0aVar = this.e) != null && g0aVar.a > 1) || (((g0aVar2 = this.f) != null && g0aVar2.a > 1) || (((g0aVar3 = this.g) != null && g0aVar3.a > 1) || ((g0aVar4 = this.h) != null && g0aVar4.a > 1)));
    }

    public final ll9 h() {
        ll9 ll9Var = this.b;
        g0a g0aVar = this.h;
        g0a g0aVar2 = this.g;
        g0a g0aVar3 = this.f;
        g0a g0aVar4 = this.e;
        if (g0aVar4 == null && g0aVar3 == null && g0aVar2 == null && g0aVar == null) {
            return ll9Var;
        }
        ll9.a aVarK = ll9Var.k();
        if (g0aVar4 != null) {
            aVarK.e = g0aVar4.b;
        }
        if (g0aVar3 != null) {
            aVarK.f = g0aVar3.b;
        }
        if (g0aVar2 != null) {
            aVarK.h = g0aVar2.b;
        }
        if (g0aVar != null) {
            aVarK.g = g0aVar.b;
        }
        return aVarK.a();
    }

    public final a i() {
        a aVar = new a();
        int i = this.a;
        aVar.a = i;
        aVar.b = this.b;
        int[][] iArr = this.c;
        int[][] iArr2 = new int[iArr.length][];
        aVar.c = iArr2;
        ll9[] ll9VarArr = this.d;
        aVar.d = new ll9[ll9VarArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        System.arraycopy(ll9VarArr, 0, aVar.d, 0, aVar.a);
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        return aVar;
    }
}
