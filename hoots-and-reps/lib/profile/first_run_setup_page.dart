import 'package:flutter/material.dart';

import 'athlete_profile_page.dart';

class FirstRunSetupPage extends StatefulWidget {
  const FirstRunSetupPage({required this.initial, super.key});
  final AthleteSettings initial;

  @override
  State<FirstRunSetupPage> createState() => _FirstRunSetupPageState();
}

class _FirstRunSetupPageState extends State<FirstRunSetupPage> {
  var _step = 0;
  late int _minutes = widget.initial.preferredSessionMinutes;
  late final Set<String> _equipment = widget.initial.availableEquipment.isEmpty
      ? {...equipmentLabels.keys}
      : {...widget.initial.availableEquipment};
  late final Set<String> _skills = {...widget.initial.skillQualifications};

  AthleteSettings get _settings => AthleteSettings(
    unit: widget.initial.unit,
    personalRecordsLb: widget.initial.personalRecordsLb,
    trainingMaxesLb: widget.initial.trainingMaxesLb,
    movementPreferences: widget.initial.movementPreferences,
    restrictedPatterns: widget.initial.restrictedPatterns,
    reportedInjuries: widget.initial.reportedInjuries,
    availableEquipment: _equipment,
    skillQualifications: _skills,
    trainingDays: widget.initial.trainingDays,
    preferredSessionMinutes: _minutes,
  );

  @override
  Widget build(BuildContext context) => Scaffold(
    backgroundColor: const Color(0xff070615),
    appBar: AppBar(
      backgroundColor: const Color(0xff070615),
      title: const Text('SET UP YOUR QUEST'),
      automaticallyImplyLeading: false,
    ),
    body: SafeArea(
      child: Padding(
        padding: const EdgeInsets.all(20),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              'STEP ${_step + 1} OF 3',
              style: const TextStyle(
                color: Color(0xff56d7ff),
                fontWeight: FontWeight.w900,
              ),
            ),
            const SizedBox(height: 10),
            Expanded(child: _body()),
            Row(
              children: [
                if (_step > 0)
                  TextButton(
                    onPressed: () => setState(() => _step--),
                    child: const Text('BACK'),
                  ),
                const Spacer(),
                FilledButton(
                  onPressed: _step == 2
                      ? () => Navigator.pop(context, _settings)
                      : () => setState(() => _step++),
                  child: Text(_step == 2 ? 'FINISH SETUP' : 'CONTINUE'),
                ),
              ],
            ),
          ],
        ),
      ),
    ),
  );

  Widget _body() => switch (_step) {
    0 => Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        const Text(
          'TRAINING RHYTHM',
          style: TextStyle(
            color: Color(0xfff7f5ef),
            fontSize: 25,
            fontWeight: FontWeight.w900,
          ),
        ),
        const SizedBox(height: 8),
        const Text(
          'Choose the default view that fits your week. You can change it any time.',
          style: TextStyle(color: Color(0xffada6c1), height: 1.4),
        ),
        const SizedBox(height: 22),
        SegmentedButton<int>(
          segments: const [
            ButtonSegment(value: 60, label: Text('60 MIN')),
            ButtonSegment(value: 90, label: Text('90 MIN')),
          ],
          selected: {_minutes},
          onSelectionChanged: (value) => setState(() => _minutes = value.first),
        ),
      ],
    ),
    1 => _switchList(
      'EQUIPMENT ACCESS',
      'Only enable what you can normally use. Future workouts adapt to this.',
      equipmentLabels,
      _equipment,
    ),
    _ => _switchList(
      'SKILLS & EXPERIENCE',
      'Turn off a skill to receive its reviewed progression instead.',
      {for (final item in skillQualificationDefinitions) item.key: item.label},
      _skills,
    ),
  };

  Widget _switchList(
    String title,
    String description,
    Map<String, String> labels,
    Set<String> selected,
  ) => Column(
    crossAxisAlignment: CrossAxisAlignment.start,
    children: [
      Text(
        title,
        style: const TextStyle(
          color: Color(0xfff7f5ef),
          fontSize: 25,
          fontWeight: FontWeight.w900,
        ),
      ),
      const SizedBox(height: 8),
      Text(
        description,
        style: const TextStyle(color: Color(0xffada6c1), height: 1.4),
      ),
      const SizedBox(height: 16),
      Expanded(
        child: ListView(
          children: labels.entries
              .map(
                (entry) => SwitchListTile(
                  contentPadding: EdgeInsets.zero,
                  title: Text(
                    entry.value,
                    style: const TextStyle(color: Color(0xfff7f5ef)),
                  ),
                  value: selected.contains(entry.key),
                  onChanged: (value) => setState(
                    () => value
                        ? selected.add(entry.key)
                        : selected.remove(entry.key),
                  ),
                ),
              )
              .toList(),
        ),
      ),
    ],
  );
}
