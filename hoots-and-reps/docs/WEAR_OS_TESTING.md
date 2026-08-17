# Testing the Hoots & Reps Wear OS prototype

The first watch build is a device-local exercise prototype. It proves the
active workout loop—timer, heart-rate permission, Health Services data, haptics,
and the ongoing notification—before the phone-to-watch guided-workout sync is
added.

## Build

From `android/`:

```sh
GRADLE_USER_HOME="$PWD/.gradle-cache" ./gradlew :wear:assembleDebug
```

The APK is emitted at:

```text
../build/wear/outputs/apk/debug/wear-debug.apk
```

## Physical Pixel Watch

1. On the watch, enable Developer options and **Wireless debugging**.
2. Pair ADB with the pairing address/code shown by the watch, then connect to
   its debugging address.
3. Install the APK:

   ```sh
   adb install -r ../build/wear/outputs/apk/debug/wear-debug.apk
   ```

4. Open **Hoots & Reps** from the watch app list.
5. Tap **START**, grant the heart-rate permission, and confirm that BPM replaces
   `— BPM`. Tap **PAUSE**, **RESUME**, and **END WORKOUT** to confirm haptic
   feedback and the active-workout notification behavior.

A screen-on real-device test should show actual optical-sensor data after the
watch has found a stable reading. Tighten the band and move for a minute before
judging the value.

## Wear OS emulator

Install the APK to a running Wear OS emulator:

```sh
adb install -r ../build/wear/outputs/apk/debug/wear-debug.apk
```

Wear OS 4+ emulators provide Health Services test data. If the emulator needs
the synthetic sensor provider explicitly enabled, run:

```sh
adb shell am broadcast -a "whs.USE_SYNTHETIC_PROVIDERS" \
  com.google.android.wearable.healthservices
adb shell am broadcast -a "whs.synthetic.user.START_RUNNING" \
  com.google.android.wearable.healthservices
```

Open the Hoots app and start the workout. The heart-rate number should update.
To restore normal sensor providers:

```sh
adb shell am broadcast -a "whs.USE_SENSOR_PROVIDERS" \
  com.google.android.wearable.healthservices
```

## Expected behavior and known scope

- The prototype requests only in-workout heart-rate access; it does not collect
  background/all-day health data.
- The timer and HR stay active while the screen sleeps via a foreground service.
- The current title and section are a local placeholder: `Guided workout /
  Warm-up`.
- Rounds, rep logging, interval/EMOM views, results, and phone sync are the
  next layers. This prototype intentionally does not write or alter existing
  phone workout history.
