package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r5a extends MenuInflater {
    public static final Class<?>[] e;
    public static final Class<?>[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] c = {MenuItem.class};
        public Object a;
        public Method b;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Object obj = this.a;
            Method method = this.b;
            try {
                if (method.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e) {
                d55.a(e);
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b {
        public CharSequence A;
        public CharSequence B;
        public final Menu a;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public v8 z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public boolean f = true;
        public boolean g = true;

        public b(Menu menu) {
            this.a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, r5a.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            r5a r5aVar = r5a.this;
            Context context = r5aVar.c;
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.y != null) {
                if (context.isRestricted()) {
                    aa0.c("The android:onClick attribute cannot be used within a restricted context");
                    return;
                }
                if (r5aVar.d == null) {
                    r5aVar.d = r5a.a(context);
                }
                Object obj = r5aVar.d;
                String str = this.y;
                a aVar = new a();
                aVar.a = obj;
                Class<?> cls = obj.getClass();
                try {
                    aVar.b = cls.getMethod(str, a.c);
                    menuItem.setOnMenuItemClickListener(aVar);
                } catch (Exception e) {
                    StringBuilder sbA = aa.a("Couldn't resolve menu item onClick handler ", str, " in class ");
                    sbA.append(cls.getName());
                    InflateException inflateException = new InflateException(sbA.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof h) {
                    h hVar = (h) menuItem;
                    hVar.x = (hVar.x & (-5)) | 4;
                } else if (menuItem instanceof qr6) {
                    qr6 qr6Var = (qr6) menuItem;
                    s5a s5aVar = qr6Var.d;
                    try {
                        if (qr6Var.e == null) {
                            qr6Var.e = s5aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        qr6Var.e.invoke(s5aVar, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str2 = this.x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, r5a.e, r5aVar.a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            v8 v8Var = this.z;
            if (v8Var != null) {
                if (menuItem instanceof s5a) {
                    ((s5a) menuItem).a(v8Var);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z2 = menuItem instanceof s5a;
            if (z2) {
                ((s5a) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                or6.b(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z2) {
                ((s5a) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                or6.f(menuItem, charSequence2);
            }
            char c = this.n;
            int i3 = this.o;
            if (z2) {
                ((s5a) menuItem).setAlphabeticShortcut(c, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                or6.a(menuItem, c, i3);
            }
            char c2 = this.p;
            int i4 = this.q;
            if (z2) {
                ((s5a) menuItem).setNumericShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                or6.e(menuItem, c2, i4);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z2) {
                    ((s5a) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    or6.d(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z2) {
                    ((s5a) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    or6.c(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public r5a(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    ru3.d("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                ru3.d("Unexpected end of document");
                return;
            }
            Menu menu2 = bVar.a;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ph8.p);
                        bVar.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        bVar.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        bVar.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        bVar.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        bVar.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        bVar.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ph8.q);
                        bVar.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        bVar.j = (typedArrayObtainStyledAttributes2.getInt(5, bVar.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, bVar.d) & 65535);
                        bVar.k = typedArrayObtainStyledAttributes2.getText(7);
                        bVar.l = typedArrayObtainStyledAttributes2.getText(8);
                        bVar.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        bVar.n = string == null ? (char) 0 : string.charAt(0);
                        bVar.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        bVar.p = string2 == null ? (char) 0 : string2.charAt(0);
                        bVar.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            bVar.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            bVar.r = bVar.e;
                        }
                        bVar.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        bVar.t = typedArrayObtainStyledAttributes2.getBoolean(4, bVar.f);
                        bVar.u = typedArrayObtainStyledAttributes2.getBoolean(1, bVar.g);
                        bVar.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        bVar.y = typedArrayObtainStyledAttributes2.getString(12);
                        bVar.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        bVar.x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && bVar.w == 0 && bVar.x == null) {
                            bVar.z = (v8) bVar.a(string3, f, this.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.z = null;
                        }
                        bVar.A = typedArrayObtainStyledAttributes2.getText(17);
                        bVar.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            bVar.D = d83.c(typedArrayObtainStyledAttributes2.getInt(19, -1), bVar.D);
                        } else {
                            bVar.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = vz1.b(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            bVar.C = colorStateList;
                        } else {
                            bVar.C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        bVar.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        bVar.h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(bVar.b, bVar.i, bVar.j, bVar.k);
                        bVar.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        bVar.b = 0;
                        bVar.c = 0;
                        bVar.d = 0;
                        bVar.e = 0;
                        bVar.f = true;
                        bVar.g = true;
                    } else if (name3.equals("item")) {
                        if (!bVar.h) {
                            v8 v8Var = bVar.z;
                            if (v8Var == null || !v8Var.a()) {
                                bVar.h = true;
                                bVar.b(menu2.add(bVar.b, bVar.i, bVar.j, bVar.k));
                            } else {
                                bVar.h = true;
                                bVar.b(menu2.addSubMenu(bVar.b, bVar.i, bVar.j, bVar.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof q5a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof f) {
                    f fVar = (f) menu;
                    if (!fVar.p) {
                        fVar.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((f) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((f) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
