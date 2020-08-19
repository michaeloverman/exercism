fun transcribeToRna(dna: String): String = dna.replace('G', '#').replace('C', 'G').replace('#', 'C').replace('A', 'U').replace('T', 'A')
