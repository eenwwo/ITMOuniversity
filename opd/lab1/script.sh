#!/bin/bash

chmod -R 777 ~/lab0
rm -rf ~/lab0

mkdir lab0
cd lab0

touch eevee4

mkdir -p gulpin6/vespiquen
mkdir gulpin6/stunky
mkdir gulpin6/silcoon

mkdir -p krookodile8/electabuzz
mkdir krookodile8/archeops
mkdir krookodile8/braviary

mkdir linoone7
touch linoone7/rhyhorn

echo -e 'Возможности Overland=6 Surface=4 Jump=3 Power=1\nIntelligence=4 Tracker=0' > eevee4
echo -e 'Живет Cave Ocean' > gulpin6/omanyte
echo -e 'Тип\nпокемона GRASS NONE' > gulpin6/sunflora
echo -e 'Живет Forest Urban' > krookodile8/gallade
echo -e 'Возможности\nOverland=6 Surface=2 Jump=2 Power=2\nIntelligence=3' > krookodile8/numel
echo -e 'Способности Confusion Disable Miracle Eye\nAlly Switch Psybeam Reflect Telekinesis Recover Psycho Cut Role Play\nPsychic Future Sight Trick' > krookodile8/kadabra
echo -e 'Способности Swarm Blaze Flame\nBody Overcoat' > larvesta1
echo -e 'Ходы Bind Bug Bite Bullet Seed Double-Edhe\nGastro Acid Giga Drain Knock Off Natural Gift Razor Leaf≠ Secret Power\nSeed Bomb Sleep Powder Sleep Talk≠ Snore Spit Up≠ Stockpile≠ Sucker\nPuch Swallow≠ Sweet Scent≠ Synthesis Worry Seed' > linoone7/victreebel
echo -e 'Ходы After\nYou Dark Pulse Gravity Magic Coat Pain Split Recycle Role Play Signal\nBeam Skill Swap Sleep Talk Snatch Snore Trick Uproar Wonder Room Zen\nHeadbutt' > linoone7/beheeyem
echo -e 'Тип диеты\nPhototroph' > tangela3

chmod 444 eevee4
chmod u=rwx,g=-wx,o=rwx gulpin6
chmod 573 gulpin6/vespiquen

chmod u=rwx,g=rx,o=w gulpin6/stunky
chmod 620 gulpin6/omanyte
chmod u=rw,g=w,o= gulpin6/sunflora

chmod a+wx gulpin6/silcoon
chmod 751 krookodile8
chmod 400 krookodile8/gallade

chmod u=rx,g=rwx,o=rwx krookodile8/electabuzz
chmod u=wx,g=rw,o=wx krookodile8/archeops
chmod u=wx,g=wx,o=rx krookodile8/braviary

chmod 400 krookodile8/numel
chmod u=rw,g=,o=r krookodile8/kadabra
chmod 046 larvesta1

chmod u=wx,g=x,o=w linoone7
chmod 400 linoone7/victreebel
chmod 046 linoone7/beheeyem

chmod 440 linoone7/rhyhorn
chmod 044 tangela3